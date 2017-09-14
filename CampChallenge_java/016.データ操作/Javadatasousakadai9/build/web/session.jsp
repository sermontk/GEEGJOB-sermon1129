<%-- 
    Document   : session
    Created on : 2017/09/13, 18:29:57
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.swing.JTextField"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
            <%
                
            //セッションを取得
            HttpSession hs = request.getSession();
            request.setCharacterEncoding("UTF-8");
            //セッションから取得した内容をそれぞれ文字列に変換。
             String a = request.getParameter("name");
            String b = request.getParameter("gender");
            String c = request.getParameter("hobby");
            //入力フィールドで選択、入力した内容(文字列)をセッションに保存。
            hs.setAttribute("pf1", a);
            hs.setAttribute("pf2", b);
            hs.setAttribute("pf3", c);
            
           
           
            
            
            if(hs.getAttribute("pf1") == null){
                //前回のログイン履歴がない場合が「初ログインです。」と表記。
                out.print("初ログインです。");
            }
            else{
                        //セッションから取得した内容を表示。
                        out.print("あなたのプロフィール"+"<br>");
                        out.print(hs.getAttribute("pf1")+"<br>");
                        out.print(hs.getAttribute("pf2")+"<br>");
                        out.print(hs.getAttribute("pf3")+"<br>");
            } 
            
        %>
