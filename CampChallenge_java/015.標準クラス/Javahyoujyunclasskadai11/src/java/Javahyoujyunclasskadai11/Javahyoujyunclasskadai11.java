/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javahyoujyunclasskadai11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.System;
import java.util.Date;
import java.io.*;
/**
 *
 * @author t.k
 */
public class Javahyoujyunclasskadai11 extends HttpServlet {

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
            //日付Dateを作成。
            Date now = new Date();
            //ログファイルを作成。
            File log = new File("text.txt");
            //日付と処理開始を記入。
            FileWriter fw = new FileWriter(log,true);
            fw.write(now+"処理開始"+"<br>");
                  
            
        
		//インスタンス化
		Character objChar1, objChar2;
		objChar1=new Character('a');
		objChar2=new Character('5');


		boolean bln=objChar1.equals(objChar2);
		
                
                //日付と処理終了を記入。
                fw.write(now+"処理終了"+"<br>");
                fw.close();
                
                FileReader fr = new FileReader(log);
                BufferedReader br = new BufferedReader(fr);
                //記入内容を表示。
                out.print(br.readLine());
                br.close();
                //クラスの処理結果を表示。
		out.println("objChar1: "+objChar1.charValue()+"<br>");
		out.println("objChar2: "+objChar2.charValue()+"<br>");
                out.println("objChar1=objChar2? "+bln);
                
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
