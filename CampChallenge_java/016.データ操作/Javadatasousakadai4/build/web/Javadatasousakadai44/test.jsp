<%-- 
    Document   : Javadatasousakadai4
    Created on : 2017/09/12, 16:02:01
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%  
        request.setCharacterEncoding("UTF-8");
        //入力フィールドからの情報を入手する。
        int a = Integer.parseInt(request.getParameter("type"));
        int c = Integer.parseInt(request.getParameter("total"));
        int b = Integer.parseInt(request.getParameter("count"));
        //選択した商品によって表示がかわる。
        switch(a){
            case 1:
                out.print("雑貨"+"<br>");
                break;
                    case 2:
                        out.print("生鮮食品"+"<br>");
                        break;
                            case 3:
                                out.print("その他"+"<br>");
                                break;
        }
        int total1 = c/b;
        //1個当たりの値段を表示。
        out.print("金額は"+c+"円で"+"<br>");
        out.print("個数は"+b+"個"+"<br>");
        out.print("1個当たりの値段は"+total1+"円です"+"<br>");
        //総額に応じた値段を表示。
        String point = "ポイントつきます。";
        if(c>=5000){
            out.print(c*0.05+point);
        }else if(c>=3000) {
            out.print(c*0.04+point);
    }

    %>
    
    
    
    
        <h1>Hello World!</h1>
    </body>
</html>
