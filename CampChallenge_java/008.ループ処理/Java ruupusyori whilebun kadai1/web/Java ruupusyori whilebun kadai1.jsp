<%-- 
    Document   : Java ruupusyori whilebun kadai1
    Created on : 2017/08/25, 11:11:53
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int suji = 1000;
    while (suji > 100){
        suji = suji / 2;
}
    out.print(suji);
%>
