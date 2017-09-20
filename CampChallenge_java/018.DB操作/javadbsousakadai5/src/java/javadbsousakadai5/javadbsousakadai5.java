/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbsousakadai5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author t.k
 */
@WebServlet(name = "javadbsousakadai5", urlPatterns = {"/javadbsousakadai5"})
public class javadbsousakadai5 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rd = null;
            
           
            try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","sermon1129","tk07041129");
            out.print("データベース接続完了"+"<br>");
            
            ps = conn.prepareStatement("select * from profiles where name like ?");
            ps.setString(1,"%茂%");
            rd = ps.executeQuery();
            while(rd.next()){
                out.print("ID;"+rd.getInt("profilesID")+"<br>");
                out.print("名前;"+rd.getString("name")+"<br>");
                out.print("電話番号;"+rd.getString("tel")+"<br>");
                out.print("年齢;"+rd.getInt("age")+"<br>");
                out.print("誕生日;"+rd.getString("birthday")+"<br>");
            }
            
            
            }catch (SQLException e) {
                out.print(e.getMessage());
            } catch (Exception e) {
                out.print(e.getMessage());
            } finally {
                if (conn != null) {
                    try {

                        conn.close();
                        out.print("DBとの切断に成功");

                    } catch (Exception e) {

                        out.print(e.getMessage());
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
