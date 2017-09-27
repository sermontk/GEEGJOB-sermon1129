


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="javax.servlet.http.HttpSession"%>
<%@page import ="java.sql.SQLException"%>
     <%
         try{
         HttpSession se = request.getSession();
      String a = (String)se.getAttribute("set");
      if (a.equals("OK")){
          out.print("入力完了しました！！"); 
      }
         }catch (Exception f) {
                    System.out.print(f.getMessage());
                
                        }
      %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>メイン画面<h1>              
        <form action ="data"method = "post">
        <br><font size ="3">
        <p><input type = "radio" name = "select" value = "main1"</p>商品を追加する
        <p><input type = "radio" name = "select" value = "main2"</p>商品を閲覧する
        <p>
        <input type ="submit" name ="送信"></form>
        </body>
         
</html>
