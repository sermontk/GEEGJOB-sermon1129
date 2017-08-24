

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.util.HashMap" %>
<%
    HashMap<String,String> data = new HashMap<String,String>();
    data.put("1","AAA");
    data.put("hello","world");
    data.put("soeda","34");
    data.put("20","20");
    out.print(data);
%>
