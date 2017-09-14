/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javadatasousakadai6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import javax.servlet.http.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author t.k
 */
public class Javadatasousakadai6 extends HttpServlet {

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
            
            out.print("ログイン時間を記録しました。"+"<br>");
            //日付クラスを作成。
            Date now = new Date();
            //日付クラスの変数を文字列に変換(変換しないとクッキーに保存できない為。)
            String c = String.valueOf(now);
            //クッキーにtimeという名前で文字列を記録。
            Cookie a = new Cookie("time",c);       
            //クッキーに反映。
            response.addCookie(a);
            
            //クッキーから値を取り出す。
            Cookie[] d = request.getCookies();
            if (d != null) {
                 for (int i = 0; i < d.length; i++) {
                    if (d[i].getName().equals("time")) {
                        //前回のログイン時刻を表示。
                        out.print("前回のログイン時刻:" + d[i].getValue()+"<br>");
                        break;
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
