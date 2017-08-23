<%-- 
    Document   : Java hairetu2 kadai2
    Created on : 2017/08/23, 17:20:06
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
    data.set(2,"33");
    out.print(data);
%>
