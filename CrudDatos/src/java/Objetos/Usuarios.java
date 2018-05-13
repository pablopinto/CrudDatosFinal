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
public class Usuarios {
    private String user;
    private String pass;
    private int codUsuario;

    public Usuarios(String user, String pass, int codUsuario) {
        this.user = user;
        this.pass = pass;
        this.codUsuario = codUsuario;
    }

    public Usuarios(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user=" + user + ", pass=" + pass + ", codUsuario=" + codUsuario + '}';
    }

   
    
}
