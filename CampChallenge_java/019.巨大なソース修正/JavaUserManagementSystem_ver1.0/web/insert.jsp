<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>
   <%
        HttpSession hs = request.getSession();
    //セッションよりinsertconfirmで入力した値を取り出す。
    UserDataBeans udb =(UserDataBeans)hs.getAttribute("pf");
    
    %>
      
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
    <%
    String name ="";
    Integer year =0;  
    Integer month =0;  
    Integer day =0;  
    String type ="";  
    String tell ="";  
    String comment ="";
    //insertconfirm.jspから戻ってきた際に前回入力した値を各変数に代入する。
        if (udb !=null){
    name = udb.getData(0);
    if(udb.getData(1).equals("")){
    year = 0;
    }else{
        year = Integer.parseInt(udb.getData(1));
    }
    if(udb.getData(2).equals("")){
    month = 0; 
    }else{
        month = Integer.parseInt(udb.getData(2));
    }
    if(udb.getData(3).equals("")){
    day = 0;
    }else{
        day = Integer.parseInt(udb.getData(3));
    }
    type = udb.getData(4);
    tell = udb.getData(5);
    comment = udb.getData(6);
    }
    %>
        
        
        名前:
        <input type="text" name="name"value="<%=name%>">
        <br><br>
                                     
        生年月日:
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"<%if(i ==year){%>selected="<%=year%>"<%;}%>><%=i%></option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"<%if(i == month){%>selected="<%=month%>"<%;}%>><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"<%if(i ==day){%>selected="<%=day%>"<%;}%>><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1"<%if(type != null && type.equals("1")){out.print("checked");}%>>エンジニア<br>
        <input type="radio" name="type" value="2"<%if(type != null && type.equals("2")){out.print("checked");}%>>営業<br>
        <input type="radio" name="type" value="3"<%if(type != null && type.equals("3")){out.print("checked");}%>>その他<br>
        <br>

        電話番号:
        <input type="text" name="tell" <% if(tell != null){%>value="<%=tell%>"<%;}%>>
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>