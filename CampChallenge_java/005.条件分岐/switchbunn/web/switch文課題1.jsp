<%-- 
    Document   : switch文課題1
    Created on : 2017/08/22, 18:10:28
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int num = 2;
    switch(num){
    case 1:
    out.print("one");
    break;
    case 2:
    out.print("two");
    break;
    default:
    out.print("想定外");
   break;
    }
%>
