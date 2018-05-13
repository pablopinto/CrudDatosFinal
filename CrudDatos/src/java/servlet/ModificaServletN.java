/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.Service.ServiceDao;
import Objetos.Cliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 6001018
 */
public class ModificaServletN extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
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
            ServiceDao service = new ServiceDao();

            String codigoCliente = request.getParameter("codigoCliente");
            int cod = Integer.parseInt(codigoCliente);
            Cliente cliente = new Cliente(cod);
            service.modCli(cliente);
            request.setAttribute("codCli", cod);
            request.setAttribute("cliente", service.modCli(cliente));
            response.setContentType("text/html;charset=UTF-8");
        } catch (Exception ex) {
            Logger.getLogger(ModificaServletN.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("/jsp/FormularioCliDos.jsp").forward(request, response);
    }
    
}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */



