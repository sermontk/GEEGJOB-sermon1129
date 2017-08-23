<%-- 
    Document   : java heiretu kadai1
    Created on : 2017/08/23, 16:50:43
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%
    ArrayList<String> data = new ArrayList<String>();
    data.add("10");
    data.add("100");
    data.add("soeda");
    data.add("hayashi");
    data.add("-20");
    data.add("118");
    out.print(data);
%>