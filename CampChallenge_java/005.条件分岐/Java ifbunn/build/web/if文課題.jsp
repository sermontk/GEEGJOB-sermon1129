<%-- 
    Document   : if文課題
    Created on : 2017/08/22, 17:08:25
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int hennsuu = 1;
    if (hennsuu == 1) {
    out.print("1です！");
}
    else if(hennsuu == 2){
    out.print("プログラミングキャンプ！");
}
    else {
    out.print("その他です！");
}

%>
