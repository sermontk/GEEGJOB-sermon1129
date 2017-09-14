package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JTextField;

public final class session_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            HttpSession hs = request.getSession();
            request.setCharacterEncoding("UTF-8");
            
             String a = request.getParameter("name");
            String b = request.getParameter("gender");
            String c = request.getParameter("hobby");
            
            hs.setAttribute("pf1", a);
            hs.setAttribute("pf2", b);
            hs.setAttribute("pf3", c);
            
           
           
            
            
            if(hs.getAttribute("pf1") == null){
                //前回のログイン履歴がない場合が「初ログインです。」と表記。
                out.print("初ログインです。");
            }
            else{
                        //二回目以降の場合は前回のログイン時間の履歴を表示。
                        out.print("あなたのプロフィール"+"<br>");
                        out.print(hs.getAttribute("pf1")+"<br>");
                        out.print(hs.getAttribute("pf2")+"<br>");
                        out.print(hs.getAttribute("pf3")+"<br>");
            } 
            /*今回のログイン履歴をセッションに保存。
            JTextField text1 = new JTextField();
            text1.setText("pf1");
            JTextField text2 = new JTextField();
            JTextField text3 = new JTextField();*/
            
        
      out.write('\n');
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
