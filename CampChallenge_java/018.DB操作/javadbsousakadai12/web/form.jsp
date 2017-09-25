<%-- 
    Document   : form
    Created on : 2017/09/25, 10:26:18
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
        <font size = "3">検索キーワードを入力してください。<br>
        　<input type="text"name ="name">名前<br>
        　<input type="text"name ="age">ご年齢<br>
        　<input type="text"name ="bd">誕生日<br>
         <br>
        入力完了しましたらボタンを押してください。<input type="submit"name ="送信">
        </form>
    </body>
</html>