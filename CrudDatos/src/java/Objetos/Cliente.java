/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author 6001018
 */
public class Cliente{
    private int codigoCliente;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String proyecto;
    private int codProyecto;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String nombre, String apellido, int telefono, String direccion, String proyecto) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.proyecto = proyecto;
    }

    public Cliente(int codigoCliente,String nombre, String apellido, int telefono, String direccion) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(String nombre, String apellido, int telefono, String direccion, String proyecto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.proyecto = proyecto;
    }

    public Cliente(String nombre, String apellido, int telefono, String direccion, int codProyecto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codProyecto = codProyecto;
    }

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Cliente(int codigoCliente, String nombre, String apellido, int telefono, String direccion, int codProyecto) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codProyecto = codProyecto;
    }

   
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(int codProyecto) {
        this.codProyecto = codProyecto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", proyecto=" + proyecto + ", codProyecto=" + codProyecto + '}';
    }

    

   
    
  
}
