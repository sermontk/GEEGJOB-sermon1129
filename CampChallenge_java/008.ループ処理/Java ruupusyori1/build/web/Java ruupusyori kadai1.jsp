<%-- 
    Document   : Java ruupusyori kadai1
    Created on : 2017/08/24, 20:31:51
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    long suji = 1;
    for (int i = 1;i <= 20; i++){
    suji = suji *8;
    }
    out.print(suji);
%>
