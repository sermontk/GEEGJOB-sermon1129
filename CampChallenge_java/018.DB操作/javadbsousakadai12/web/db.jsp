<%-- 
    Document   : db
    Created on : 2017/09/25, 10:26:03
    Author     : t.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*"%>
<%
                //HttpSession hs = request.getSession();
                request.setCharacterEncoding("UTF-8");
                
                Connection conn = null;
                PreparedStatement ps1 = null;
                ResultSet rd = null;
            
                String a = request.getParameter("name");
                int b = Integer.parseInt(request.getParameter("age"));
                String c = request.getParameter("bd");
            
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "sermon1129", "tk07041129");
                    out.print("データベース接続完了" + "<br>");

                  
                  
                    ps1 = conn.prepareStatement("select * from profiles where name =? or age =? or name =? ");
                    ps1.setString(1,a);  
                    ps1.setInt(2,b);
                    ps1.setString(3,c);
                    rd = ps1.executeQuery();
                   
                    while (rd.next()) {
                        out.print("検索結果を表示します。"+"<br>");
                        out.print("ID;" + rd.getInt("profilesID") + "<br>");
                        out.print("名前;" + rd.getString("name") + "<br>");
                        out.print("電話番号;" + rd.getString("tel") + "<br>");
                        out.print("年齢;" + rd.getInt("age") + "<br>");
                        out.print("誕生日;" + rd.getString("birthday") + "<br>");
                    }

                } catch (SQLException f) {
                    out.print(f.getMessage());
                } catch (Exception f) {
                    out.print(f.getMessage());
                } finally {
                    if (conn != null) {
                        try {
                            ps1.close();
                            rd.close();
                            conn.close();
                            out.print("DBとの切断に成功");

                        } catch (Exception f) {

                            out.print(f.getMessage());
                        }

                    }

                }
           %>