<%-- 
    Document   : test
    Created on : 2017/09/13, 10:32:05
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            request.setCharacterEncoding("UTF-8");
         int suji = Integer.parseInt(request.getParameter("num"));
            out.print("入力した数字は"+suji+"<br>");
            out.print("素数は　");
            //入力した値を2で割り切れるまで処理
            while ( suji % 2 == 0){
                //処理した分だけ2を表示
                out.print(2+" ");
            suji =suji / 2;
    }
            //残りの値を3,5...の順に割り切れるまで処理。
            for (int i = 3; i*i <= suji; i+=2) {
                while (suji % i == 0) {
                    //処理した分だけ該当する数値を表示
                    out.print(i + " ");
                    
                 suji /= i;
                }
            }
                    //割り切れなかったあまりの数字を表示。
                    if (suji > 1) out.print(suji);
  
         
         

        %>
