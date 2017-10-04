<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>

<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <%  
        //JavaBeansにセッションに格納したフォーム情報をセット。
        UserDataBeans udb = (UserDataBeans)hs.getAttribute("pf");
                String messe = udb.getMesse();
        Integer a = Integer.parseInt(udb.getData(4));

        if (//||!hs.getAttribute("year").equals("")
            //上記のコードのみだと名前のみ記入すれば進む為、下記のコードも追記。
           !udb.getData(0).equals("")
           &&!udb.getData(1).equals("")
           &&!udb.getData(2).equals("")
           &&!udb.getData(3).equals("")
           &&!udb.getData(4).equals("")
           &&!udb.getData(5).equals("")
           &&!udb.getData(6).equals("")
           )
    {%>
         
        
        <h1>登録確認</h1>
        名前:<%= udb.getData(0)%><br>
        生年月日:<%= udb.getData(1)+"年"+udb.getData(2)+"月"+udb.getData(3)+"日"%><br>
        種別:<% switch(a){
                case 1:
                out.print("エンジニア");
                break;
                case 2:
                out.print("営業");
                break;
                case 3:
                out.print("その他");
                break;
                               }%><br><br>
        電話番号:<%= udb.getData(5)%><br>
        自己紹介:<%= udb.getData(6)%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
        <%--フォームで不足している項目の分だけ表示する--%>
        <h2><%=messe%></h2>
    <%;}%>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%--index.jspに戻るボタン--%>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>