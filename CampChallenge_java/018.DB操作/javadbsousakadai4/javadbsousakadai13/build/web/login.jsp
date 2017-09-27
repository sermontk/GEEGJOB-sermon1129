<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "javax.servlet.http.HttpSession"%>
<%@page import ="java.sql.SQLException"%>
<%
      try{
      HttpSession se = request.getSession();
     
      String a = (String)se.getAttribute("status");
      if (a.equals("not")){
          out.print("名前かパスワードが違います。");
      }
      }catch (Exception f) {
                    System.out.print(f.getMessage());
                        }
%>
      

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
   
    <body>
        <form action ="check2"method = "post">
            <h1>ログイン画面<h1>
        <br><font size ="3">
        <p>ログインが必要です。あなたの名前とパスワードを入力してください。</p>
        ユーザーネーム<br>
        <input type="text" name="name"><br>
        パスワード<br>
        <input type="password"name ="pa"><br>
        <p>入力が完了しましたら押してください。</p>
        <input type ="submit" name ="送信"></form>
    </body>
</html>
