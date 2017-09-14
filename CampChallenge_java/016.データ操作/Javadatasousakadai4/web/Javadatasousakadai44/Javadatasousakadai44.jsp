<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body bgcolor =#7cfc00>
        
      
        <p><form action="test.jsp" method = "get" ></p>
        <p><font size = "3">金額を入力してください。<font></p>
        <input type = "text" name = "total">円<font>
        
        <p>種類を選んでください。</p>
        <p><input type = "radio" name = "type" value = "1"> 雑貨</p>
        <p><input type = "radio" name = "type" value = "2"> 生鮮食品</p>
        <p><input type = "radio" name = "type" value = "3"> その他</p>
        <p>個数を入力してください。</p>
        <p><input type = "text" name = "count">個</p>
        
      
        
        </form>
    </body>
</html>

