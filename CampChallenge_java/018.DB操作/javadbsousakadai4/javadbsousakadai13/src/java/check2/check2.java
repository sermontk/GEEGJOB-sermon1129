/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author t.k
 */
public class check2 extends HttpServlet {

    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
            String pa = request.getParameter("pa");
            
                Connection conn = null;
                PreparedStatement ps1 = null;
                ResultSet rd = null;
            
                String errormsg = "";
            try{
                 if(name == null || name.length() == 0){
                        out.print("名前が未記入です！！"+"<br>");
                    }
                 if(pa == null || pa.length() == 0){
                        out.print("パスワードが未記入です！！"+"<br>");
                            }
               
                
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaiko", "sermon1129", "tk07041129");   
           
                    ps1 = conn.prepareStatement("select * from user where name =? and pa =?");
                    ps1.setString(1,name);
                    ps1.setString(2,pa);
                    rd = ps1.executeQuery();
                    HttpSession se = request.getSession();

                    
                    if (rd.next()) {
                    se.setAttribute("login", "OK");
                    response.sendRedirect("main.jsp");
                    }else
                    se.setAttribute("status", "not");
                    {response.sendRedirect("login.jsp");
                    }

                } catch (SQLException f) {
                    out.print(f.getMessage());
                } catch (Exception f) {
                    out.print(f.getMessage());
                } finally {
                    if (conn != null) {
                        try {
                            ps1.close();
                            rd.close();
                            conn.close();
                            out.print("DBとの切断に成功");

                        } catch (Exception f) {

                            out.print(f.getMessage());
                        }

                    }

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
