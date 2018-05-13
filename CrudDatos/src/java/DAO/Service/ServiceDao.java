/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Service;

import DAO.Implementacion.ConexionDao;
import Objetos.Cliente;
import Objetos.Usuarios;
import java.util.List;

/**
 *
 * @author 6001018
 */
public class ServiceDao {

    public List<Cliente> mostrarLista() throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.mostrarLista();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void alta(Cliente cliente) throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            dao.alta(cliente);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void baja(Cliente cliente) throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            dao.baja(cliente);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Cliente> numSoc() throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.numSoc();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Cliente> modifica() throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.modifica();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Cliente modCli(Cliente cliente) throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.modCli(cliente.getCodigoCliente());
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void update(Cliente cliente) throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            dao.update(cliente);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Usuarios> inicio() throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.inicio();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Usuarios inicio(Usuarios users) throws Exception {
        ConexionDao dao = new ConexionDao();
        try {
            return dao.inicio(users);
        } catch (Exception e) {
            throw new Exception(e);
        }  
    }

}
