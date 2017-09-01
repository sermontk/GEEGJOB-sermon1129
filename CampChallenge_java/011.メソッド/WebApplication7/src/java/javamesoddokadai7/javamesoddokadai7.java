/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamesoddokadai7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "javamesoddokadai7", urlPatterns = {"/javamesoddokadai7"})
public class javamesoddokadai7 extends HttpServlet {

            String[]databese(int data){
            String[] data1 = {"no.1","AA","生年月日","住所"};
            String[] data2 = {"no.2","BB","生年月日",null};
            String[] data3 = {"no.3","CC","生年月日","住所"};
            if(data == 1){return data1;}
            else if (data == 2){return data2;}
            else{return data3;}
          }
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        for(int i = 1 ;i <  databese(1).length; i++){
           
        out.print(databese(1)[i]+"<br>");
    }
        for(int i = 1 ;i <  databese(2).length; i++){
            if( databese(2)[i]  ==  null){
            continue ;
        }
        out.print(databese(2)[i]+"<br>");
    }
        for(int i = 1 ;i <  databese(3).length; i++){
        out.print(databese(3)[i]+"<br>");
    }
        }
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
