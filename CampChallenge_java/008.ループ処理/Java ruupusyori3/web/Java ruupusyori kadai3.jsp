<%-- 
    Document   : Java ruupusyori kadai3
    Created on : 2017/08/24, 22:00:49
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int suji = 0;
    for (int i = 0; i <= 100; i++){
        suji = suji+i;        
}
    out.print(suji);
%>
