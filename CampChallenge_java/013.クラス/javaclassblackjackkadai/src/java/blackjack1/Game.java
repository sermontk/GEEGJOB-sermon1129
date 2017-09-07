/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 *
 * @author t.k
 */
public class Game extends HttpServlet {

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
            //DealerとUserのインスタンスを生成。
            Dealer dealer = new Dealer();
            User player = new User();
            //ディーラーとプレイヤーの手札に山札をセットする。
            dealer.setCard(dealer.deal());
            player.setCard(dealer.deal());
            //実際にブラックジャックを進行していく。
            out.println("それではブラックジャックスタートです！！" + "<br>");
            out.println("" + "<br>");
            out.println("全体のカードを表示します。" + "<br>");
            //52枚の山札を表示。
            out.println(dealer.cards + "<br>");
            out.println("" + "<br>");
            //プレイヤーがカードを選択する。
            out.println("この中からカードを二枚選択してください。" + "<br>");
            //プレイヤーが引いたカードを公開。
            out.println(player.mycard.get(0));
            out.println(player.mycard.get(1) + "<br>");
            //このiはHitした数字の表示に使用。
            int i = 2;
            //カードの合計が20未満の場合はHitさせる。
            while (player.checkSum()) {
                out.println("HIT！！もう一枚カードを引いてください。" + "<br>");
                player.setCard(dealer.hit());
                //Hitしたカードはその都度公開。   
                out.println(player.mycard.get(i) + "<br>");
                i++;
            }
            out.println("" + "<br>");
            //ディーラーとプレイヤーの合計を確認する。
            out.print("あなたのカードは..." + "<br>");
            out.print(player.mycard + "です。" + "<br>");
            out.print("点数の合計は" + player.open() + "点!!" + "<br>");
            out.println("" + "<br>");
            out.print("ディーラーのカードは..." + "<br>");
            out.print(dealer.mycard + "です。" + "<br>");
            out.print("点数の合計は" + dealer.open() + "点!!" + "<br>");
            out.println("" + "<br>");
            
            if (player.open() > 21) {
                out.println("bust!!あなたの負けです..." + "<br>");//プレイヤーがバーストの場合。
            } else if (player.open() == dealer.open()) {//プレイヤーとディーラーの合計点が同じ場合。
                out.println("点数が同じの為今回は引き分けです！！" + "<br>");
            } else if (player.open() < dealer.open()) {
                out.println("You Lose!!あなたの負けです..." + "<br>");//プレイヤーがディーラーの合計点より低い場合。
            } else if (player.open() > dealer.open()) {
                out.println("You Win!!あなたの勝利です!!" + "<br>");//プレイヤーがディーラーの合計点より高い場合。
            }
            out.print("" + "<br>");
            out.print("また次回の参加お待ちしております♪");
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
