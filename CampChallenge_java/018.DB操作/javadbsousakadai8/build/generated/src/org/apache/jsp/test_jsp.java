package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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
           
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
