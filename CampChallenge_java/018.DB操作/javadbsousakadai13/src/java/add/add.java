/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
/**
 *
 * @author t.k
 */
public class add extends HttpServlet {

            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rd = null;
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

           try{

            request.setCharacterEncoding("UTF-8");
            String na = request.getParameter("name");
            int ma = Integer.parseInt(request.getParameter("ma"));
            String pr = request.getParameter("pr");
            int id = Integer.parseInt(request.getParameter("id"));
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaiko", "sermon1129", "tk07041129");

                    ps = conn.prepareStatement("insert into mono(name,money,production,ID)values(?,?,?,?)");
                    ps.setString(1,na);
                    ps.setInt(2,ma);
                    ps.setString(3,pr);
                    ps.setInt(4,id);
                    ps.executeUpdate();
                    
                    HttpSession se = request.getSession();
                    se.setAttribute("set", "OK");
                    response.sendRedirect("main.jsp");
                    
                    
                   
                    
                        
            }catch (SQLException f) {
                    out.print(f.getMessage());
                }catch (Exception f) {
                    out.print(f.getMessage());
                }finally {
                    if (conn != null) {
                        try {
                            ps.close();
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
