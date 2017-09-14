<%-- 
    Document   : Javadatasousakadai9
    Created on : 2017/09/13, 18:03:15
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HttpSession hs = request.getSession();
   String a = (String)hs.getAttribute("pf1");
   String b = (String)hs.getAttribute("pf2");
   String c = (String)hs.getAttribute("pf3");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body bgcolor = #FFFF55>
        
        <p><font size ="4">名前を入力してください。</p>
            
        <p><form action ="session.jsp"method ="get"></p>
        <p><input type ="text"name = "name" value ="<%= a%>"></p>
        <p>性別を選択してください。</p>
        <p><input type = "radio" name = "gender" value = "男"<%if(b != null && b.equals("男")){out.print("checked");}%>>男</p>
        <p><input type = "radio" name = "gender" value = "女"<%if(b != null && b.equals("女")){out.print("checked");}%>>女</p>
        <p>あなたの趣味を書いてください(複数可。)</p>
        <textarea name ="hobby"><%if(c != null){out.print(c);}%></textarea>
                
            
        <input type ="submit" name ="送信">
        
        </form>
    </body>
</html>
