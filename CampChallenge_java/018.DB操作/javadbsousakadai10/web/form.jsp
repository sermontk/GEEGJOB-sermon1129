<%-- 
    Document   : form
    Created on : 2017/09/22, 20:08:47
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="db.jsp"method = "get">
        <font size = "3">消去したいIDを入力してください。<br>
        <input type="text"name ="id"><br>
        <input type="submit"name ="送信">
        </form>
    </body>
</html>
