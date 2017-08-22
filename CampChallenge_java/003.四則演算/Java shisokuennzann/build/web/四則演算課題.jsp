<%-- 
    Document   : 四則演算課題
    Created on : 2017/08/22, 15:01:37
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    final int kihonnti= 1000;
   
    int suji = 50;
    
    int tashizann = kihonnti+suji;
    int hikizann = kihonnti-suji;
    int kakezann = kihonnti*suji;
    int warizann = kihonnti/suji;
    
    out.print("足し算の値は"+tashizann+"<br>");
    out.print("引き算の値は"+hikizann+"<br>");
    out.print("掛け算の値は"+kakezann+"<br>");
    out.print("割り算の値は"+warizann);
    
%>
