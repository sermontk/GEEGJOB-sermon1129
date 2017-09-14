<%-- 
    Document   : Javadatasousakadai2
    Created on : 2017/09/12, 11:53:40
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="UTf-8"><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <body>
    <%     //受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
        //テキストボックスの取得
        
        out.print(request.getParameter("name")+"<br>");
        //ラジオボタンを取得
        out.print(request.getParameter("gender")+"<br>");
        //複数行テキストボックスを取得
        out.print(request.getParameter("hobby")+"<br>");
%>
  

    </body>

</html>
<!DOCTYPE html>
