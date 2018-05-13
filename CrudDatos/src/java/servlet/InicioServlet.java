/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.Service.ServiceDao;
import Objetos.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author 6001018
 */
public class InicioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            ServiceDao service = new ServiceDao();

            Usuarios users = new Usuarios(name, password);

            if (password.equals(service.inicio(users).getPass()) && name.equals(service.inicio(users).getUser())) {
                try {
                    request.setAttribute("listaCliente", service.mostrarLista());
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.getRequestDispatcher("jsp/TablaPrincipal.jsp").forward(request, response);
            } else {
                  request.getRequestDispatcher("/index.jsp").forward(request, response);
            }    
            out.close ();
        }

catch (Exception ex) {
            Logger.getLogger(InicioServlet.class
.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
