
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font size ="3">
        <form action="add"method="post">
        商品の情報をそれぞれ入力してください。<br>
        <br>
        <input type ="text"name ="name">商品名<br>
        <input type ="text"name ="ma">金額<br>
        <input type ="text"name ="pr">原産地<br>
        <input type ="text"name ="id">商品番号<br>
        入力が完了しましたら送信ボタンを押してください。
        <input type="submit"name ="送信"></form>
    </body>
</html>


