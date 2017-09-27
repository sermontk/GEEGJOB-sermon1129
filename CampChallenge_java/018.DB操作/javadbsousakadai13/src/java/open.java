/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class open extends HttpServlet {

            Connection conn = null;
            PreparedStatement ps1 = null;
            ResultSet rd = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

           try{

            request.setCharacterEncoding("UTF-8");
            String select = request.getParameter("select");
            if (select.equals("main1")) {
            response.sendRedirect("select.jsp");
            }else if(select.equals("main2"))
            {
            
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaiko", "sermon1129", "tk07041129");

                    ps1 = conn.prepareStatement("select * from mono");
                    rd = ps1.executeQuery();
                    while (rd.next()) {
                        out.print("商品名:"+rd.getString("name")+"<br>");
                        out.print("金額:"+rd.getInt("money")+"<br>");
                        out.print("原産地:"+rd.getString("production")+"<br>");
                        out.print("商品番号:"+rd.getInt("ID")+"<br>");
                        
                        HttpSession se = request.getSession();
                        se.setAttribute("set", "no");
                    }
                }
                
            }catch (SQLException f) {
                    System.out.print(f.getMessage());
                }catch (Exception f) {
                    System.out.print(f.getMessage());
                }finally {
                    if (conn != null) {
                        try {
                            ps1.close();
                            rd.close();
                            conn.close();
                            System.out.print("DBとの切断に成功");

                        } catch (Exception f) {

                            System.out.print(f.getMessage());
                        }

                    }
                
          
            response.setContentType("text/html; charset=UTF-8");
            out.println("<!DOCTYPE html>");
            out.println("<html> ");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>JSP Page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action =\"main.jsp\"method = \"post\">");
            out.println("<br><font size =\"3\">");
            out.println("<input type =\"submit\" name =\"メニュ―へ\">メニュ―へ</form>");
            out.println("</body>");
            out.println("</html>");
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
