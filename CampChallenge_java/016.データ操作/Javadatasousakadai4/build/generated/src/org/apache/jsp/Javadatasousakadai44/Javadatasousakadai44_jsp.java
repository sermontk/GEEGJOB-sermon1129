package org.apache.jsp.Javadatasousakadai44;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Javadatasousakadai44_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor =#7cfc00>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <p><form action=\"test.jsp\" method = \"get\" ></p>\n");
      out.write("        <p><font size = \"3\">金額を入力してください。<font></p>\n");
      out.write("        <input type = \"text\" name = \"total\">円<font>\n");
      out.write("        \n");
      out.write("        <p>種類を選んでください。</p>\n");
      out.write("        <p><input type = \"radio\" name = \"type\" value = \"1\"> 雑貨</p>\n");
      out.write("        <p><input type = \"radio\" name = \"type\" value = \"2\"> 生鮮食品</p>\n");
      out.write("        <p><input type = \"radio\" name = \"type\" value = \"3\"> その他</p>\n");
      out.write("        <p>個数を入力してください。</p>\n");
      out.write("        <p><input type = \"text\" name = \"count\">個</p>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
