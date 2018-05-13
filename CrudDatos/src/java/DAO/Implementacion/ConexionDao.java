/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implementacion;

import Objetos.Cliente;
import Objetos.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 6001018
 */
public class ConexionDao {

    /*  response.setContentType("text/html;charset=UTF-8");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud?zeroDateTimeBehavior=convertToNull", "root", "");
            String insercion = "INSERT INTO empleado(nombre,apellido,telefono,direccion,codProyecto) VALUES (?,?,?,?,?)";
     */
    public static final String URL = "jdbc:mysql://localhost:3306/crud?zeroDateTimeBehavior=convertToNull";
    public static final String user = "root";
    public static final String pass = "";
    private static Connection conexion;

    public static Connection getConnection() throws Exception {
        if (conexion == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, user, pass);
        }
        return conexion;
    }

    public List<Cliente> mostrarLista() throws Exception {
        List<Cliente> lista = new ArrayList();
        getConnection();
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery("SELECT empleado.codigoCliente,empleado.nombre,empleado.apellido,empleado.telefono,empleado.direccion,proyectos.NomProyecto from empleado inner join proyectos on empleado.codProyecto=proyectos.codProyecto order by 1 asc");

        while (listado.next()) {
            String nombre = listado.getString("nombre");
            String apellido = listado.getString("apellido");
            int telefono = listado.getInt("telefono");
            String direccion = listado.getString("direccion");
            String proyecto = listado.getString("proyectos.NomProyecto");
            int codigo = listado.getInt("codigoCliente");
            Cliente cliente = new Cliente(codigo, nombre, apellido, telefono, direccion, proyecto);
            lista.add(cliente);
        }
        return lista;
    }

    public void alta(Cliente cliente) throws Exception {
        getConnection();
        PreparedStatement insercion = conexion.prepareStatement("INSERT INTO empleado(nombre,apellido,telefono,direccion,codProyecto) VALUES (?,?,?,?,?)");
        //insercion.executeQuery("INSERT INTO empleado(nombre,apellido,telefono,direccion,codProyecto) VALUES (?,?,?,?,?)");
        insercion.setString(1, cliente.getNombre());
        insercion.setString(2, cliente.getApellido());
        insercion.setInt(3, cliente.getTelefono());
        insercion.setString(4, cliente.getDireccion());
        insercion.setInt(5, cliente.getCodProyecto());
        insercion.executeUpdate();
    }

    public void baja(Cliente cliente) throws Exception {
        getConnection();
        PreparedStatement borrado = conexion.prepareStatement("DELETE FROM empleado WHERE codigoCliente=" + cliente.getCodigoCliente());
        borrado.executeUpdate();
    }

    public List<Cliente> numSoc() throws Exception {
        List<Cliente> pideNum = new ArrayList();
        getConnection();
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery("SELECT * FROM empleado");
        while (listado.next()) {
            int codigoCliente = listado.getInt("codigoCliente");
            String nombre = listado.getString("nombre");
            String apellido = listado.getString("apellido");
            int telefono = listado.getInt("telefono");
            String direccion = listado.getString("direccion");
            Cliente empleado = new Cliente(codigoCliente, nombre, apellido, telefono, direccion);
            pideNum.add(empleado);
        } // while

        return pideNum;
    }

    public List<Cliente> modifica() throws Exception {
        List<Cliente> modifica = new ArrayList();
        getConnection();
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery("SELECT empleado.codigoCliente,empleado.nombre,empleado.apellido,empleado.telefono,empleado.direccion,proyectos.NomProyecto from empleado inner join proyectos on empleado.codProyecto=proyectos.codProyecto order by 1 asc");

        while (listado.next()) {
            int codigoCliente = listado.getInt("codigoCliente");
            String nombre = listado.getString("nombre");
            String apellido = listado.getString("apellido");
            int telefono = listado.getInt("telefono");
            String direccion = listado.getString("direccion");
            String proyecto = listado.getString("proyectos.NomProyecto");
            Cliente empleado = new Cliente(codigoCliente, nombre, apellido, telefono, direccion, proyecto);
            modifica.add(empleado);
        } // while
        return modifica;
    }

    public Cliente modCli(final Integer codigoCliente) throws Exception {
        getConnection();
        PreparedStatement mod = conexion.prepareStatement("SELECT nombre, apellido,telefono,direccion,codProyecto FROM empleado WHERE codigoCliente = ?");

        mod.setInt(1, codigoCliente);

        Cliente clienteN = null;
        ResultSet var = mod.executeQuery();
        while (var.next()) {
            String nombre = var.getString("nombre");
            String apellido = var.getString("apellido");
            int telefono = var.getInt("telefono");
            String direccion = var.getString("direccion");
            String proyecto = var.getString("codProyecto");
            clienteN = new Cliente(nombre, apellido, telefono, direccion, proyecto);
        }
        return clienteN;
    } // while

    public void update(Cliente cliente) throws Exception {
        getConnection();
        PreparedStatement update = conexion.prepareStatement("Update empleado set nombre = ? ,apellido = ?, telefono = ?,direccion = ?,codProyecto=? WHERE codigoCliente=?");

        update.setString(1, cliente.getNombre());
        update.setString(2, cliente.getApellido());
        update.setInt(3, cliente.getTelefono());
        update.setString(4, cliente.getDireccion());
        update.setInt(5, cliente.getCodProyecto());
        update.setInt(6, cliente.getCodigoCliente());
        update.executeUpdate();

    }

    public List<Usuarios> inicio() throws Exception {
        List<Usuarios> init = new ArrayList();
        getConnection();
        Statement s = conexion.createStatement();
        ResultSet listado = s.executeQuery("Select * from usuarios");
        while (listado.next()) {
            String usuario = listado.getString("usuario");
            String contraseña = listado.getString("contrasena");
            int codUser = listado.getInt("codUsuario");
            Usuarios users = new Usuarios(usuario, contraseña, codUser);
            init.add(users);
        } // while

        return init;
    }

    public Usuarios inicio(Usuarios users) throws Exception {
        getConnection();
        PreparedStatement mod = conexion.prepareStatement("SELECT usuario , contrasena FROM usuarios WHERE usuario = ? and contrasena = ?");
        
        Usuarios userN = null;
        mod.setString(1, users.getUser());
        mod.setString(2, users.getPass());

        ResultSet var = mod.executeQuery();
        while (var.next()) {
            String usuario = var.getString("usuario");
            String password = var.getString("contrasena");
            userN = new Usuarios(usuario, password);
        }
        if (userN == null){
             userN = new Usuarios("admin","admin");
        }
        return userN;
    }
}
