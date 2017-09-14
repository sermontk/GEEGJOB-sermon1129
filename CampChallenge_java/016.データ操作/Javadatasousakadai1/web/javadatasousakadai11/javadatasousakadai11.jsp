<%-- 
    Document   : javadatasousakadai11
    Created on : 2017/09/12, 17:40:50
    Author     : t.k
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body bgcolor =#7cfc00>
        
        <p><font size = "3">名前を入力してください。<font></p>
        <p><form action="test.jsp" method = "post" ></p>
        <p><input type = "text" name = "name"></p>
        <p><font size = "3">性別を選んでください。<font></p>
        <p><input type = "radio" name = "gender" value = "男">男</p>
        <p><input type = "radio" name = "gender" value = "女">女</p>
       
        <p><font size = "3">あなたの趣味を入力してください。<font></p>
        <textarea name="hobby" ></textarea>
        <input type="submit" name="送信">
        
        </form>
    </body>
</html>

