package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Javadatasousakadai9_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 HttpSession hs = request.getSession();
   String a = (String)hs.getAttribute("pf1");
   String b = (String)hs.getAttribute("pf2");
   String c = (String)hs.getAttribute("pf3");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor = #FFFF55>\n");
      out.write("        \n");
      out.write("        <p><font size =\"4\">名前を入力してください。</p>\n");
      out.write("            \n");
      out.write("        <p><form action =\"session.jsp\"method =\"get\"></p>\n");
      out.write("        <p><input type =\"text\"name = \"name\" ");
if(a != null){out.print(a);}
      out.write("</p>\n");
      out.write("        <p>性別を選択してください。</p>\n");
      out.write("        <p><input type = \"radio\" name = \"gender\" value = \"男\"");
if(b != null && b.equals("男")){out.print("checked");}
      out.write(">男</p>\n");
      out.write("        <p><input type = \"radio\" name = \"gender\" value = \"女\"");
if(b != null && b.equals("女")){out.print("checked");}
      out.write(">女</p>\n");
      out.write("        <p>あなたの趣味を書いてください(複数可。)</p>\n");
      out.write("        <textarea name =\"hobby\">");
if(c != null){out.print(c);}
      out.write("</textarea>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        <input type =\"submit\" name =\"送信\">\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
