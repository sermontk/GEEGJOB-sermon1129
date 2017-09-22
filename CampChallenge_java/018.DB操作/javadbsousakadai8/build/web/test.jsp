<%-- 
    Document   : test
    Created on : 2017/09/21, 20:37:20
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*"%>
<%
                //HttpSession hs = request.getSession();
                request.setCharacterEncoding("UTF-8");
                
                Connection conn = null;
                PreparedStatement ps = null;
                ResultSet rd = null;
                String a =request.getParameter("name");
                //hs.setAttribute("pf1", a);
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "sermon1129", "tk07041129");
                    out.print("データベース接続完了" + "<br>");

                  
                  
                    ps = conn.prepareStatement("select * from profiles where name like ?");
                    ps.setString(1,"%"+a+"%");
                    rd = ps.executeQuery();
                    
                    
                    while (rd.next()) {
                        out.print("検索結果を表示します。"+"<br>");
                        out.print("ID;" + rd.getInt("profilesID") + "<br>");
                        out.print("名前;" + rd.getString("name") + "<br>");
                        out.print("電話番号;" + rd.getString("tel") + "<br>");
                        out.print("年齢;" + rd.getInt("age") + "<br>");
                        out.print("誕生日;" + rd.getString("birthday") + "<br>");
                    }

                } catch (SQLException e) {
                    out.print(e.getMessage());
                } catch (Exception e) {
                    out.print(e.getMessage());
                } finally {
                    if (conn != null) {
                        try {
                            ps.close();
                         
                            rd.close();
                            conn.close();
                            out.print("DBとの切断に成功");

                        } catch (Exception e) {

                            out.print(e.getMessage());
                        }

                    }

                }
           %>
        














