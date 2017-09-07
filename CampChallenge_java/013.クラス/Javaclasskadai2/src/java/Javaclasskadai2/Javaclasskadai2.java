/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaclasskadai2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author t.k
 */
public class Javaclasskadai2 extends HttpServlet {

     class human {
    //Height、Weightクラスを宣言
        public int Height = 0;
        public int Weight = 0;
        //メソッドを宣言
        public void sethuman(int a,int b){
            this.Height = a;
            this.Weight = b;
        }
            }
            
     class hito extends human{
         public void clear(){
         Height = 0;
         Weight = 0;
         }
     }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            {
            human Akun = new human();
            Akun.sethuman(175,75);
            out.print(Akun.Height+","+Akun.Weight+"<br>");
             }
             {
            hito Akun = new hito();
            out.print(Akun.Height+","+Akun.Weight+"<br>");
             }
        }
            
            
            }
    
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
