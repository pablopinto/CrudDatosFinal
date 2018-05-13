/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.Service.ServiceDao;
import Objetos.Cliente;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 6001018
 */
public class AltaServlet extends HttpServlet {

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
        ServiceDao service = new ServiceDao();

        try {
            int telefono = 0;
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            telefono = Integer.parseInt(request.getParameter("telefono"));
            String direccion = request.getParameter("direccion");
            int codProyecto = Integer.parseInt(request.getParameter("codProyecto"));
//            String NomProyecto = request.getParameter("NomProyecto");

            Cliente cliente = new Cliente(nombre, apellido, telefono, direccion, codProyecto);
            if ((nombre != null || apellido != null ||direccion != null)) {
                service.alta(cliente);
                request.setCharacterEncoding("UTF-8");
                request.getRequestDispatcher("jsp/Alta.jsp").forward(request, response);
            }  else {
                request.getRequestDispatcher("jsp/FormCli.jsp").forward(request, response);
            }

        } catch (Exception ex) {
            Logger.getLogger(AltaServlet.class.getName()).log(Level.SEVERE, null, ex);
            request.getRequestDispatcher("/FormCliServlet").forward(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
    }
}
