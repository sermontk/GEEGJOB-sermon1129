<%-- 
    Document   : switch文課題2
    Created on : 2017/08/22, 18:53:57
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    char tanngo = 'A';
    switch(tanngo){
    case 'A':
    out.print("英語");
    break;
    case 'あ':
    out.print("日本語");
    break;
}    
%>