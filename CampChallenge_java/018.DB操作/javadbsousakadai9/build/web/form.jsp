<%-- 
    Document   : form
    Created on : 2017/09/21, 22:17:32
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <form action = "db.jsp"method = "get">
        <font size = "3">あなたのプロフィールを入力してください。<br>
        
        <input type ="text"name ="id">IDナンバー<br>
           <br>
        <input type ="text"name ="name">フルネーム<br>
           <br>
        <input type ="text"name ="tel">電話番号<br>
           <br>
        <input type ="text"name ="age">年齢<br>
           <br>
        <input type ="text"name ="bd">誕生日<br>
           <br>
        <input type="submit" name="送信">
        </form>
    </body>
</html>
