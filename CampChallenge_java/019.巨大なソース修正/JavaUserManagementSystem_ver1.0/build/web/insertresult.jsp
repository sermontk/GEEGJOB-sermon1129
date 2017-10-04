<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper"%>
<%@page import="jums.UserDataBeans"%>
<%  
    //セッションを呼び出し、JavaBeansに値を格納する。
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("pf");
    Integer a = Integer.parseInt(udb.getData(4));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    
        <h1>登録結果</h1><br>
        名前:<%=udb.getData(0)%><br>
        生年月日:<%=udb.getData(1)+"年"+udb.getData(2)+"月"+udb.getData(3)+"日"%><br>
        種別:<%switch(a){
                case 1:
                out.print("エンジニア");
                break;
                case 2:
                out.print("営業");
                break;
                case 3:
                out.print("その他");
                break;
                               }%><br>
        電話番号:<%= udb.getData(5)%><br>
        自己紹介:<%= udb.getData(6)%><br>
        以上の内容で登録しました。<br>
    <br><br>
    <%--index.jspに戻るボタン--%>
    <%=JumsHelper.getInstance().home()%>
</html>

