package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Principal.JspCalendar;
import Principal.Jugador;

public final class verZodiaco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ver Zodiaco</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/verZodiaco.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Datos</h1>\n");
      out.write("            ");
 
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fecha = request.getParameter("fecha");
            String signo = JspCalendar.obtenerSignoZodiaco(fecha);
            String edad = JspCalendar.obtenerEdad(fecha);
            
      out.write("\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <label>Nombre: ");
      out.print(nombre);
      out.write("</label>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <label>Apellido: ");
      out.print(apellido);
      out.write("</label>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <label>Fecha: ");
      out.print(fecha);
      out.write("</label>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <label>Signo del Zodiaco: ");
      out.print(signo);
      out.write("</label>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <label>Edad: ");
      out.print(edad);
      out.write("</label>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"btn-container\">\n");
      out.write("            <button class=\"btn\" onclick=\"goToIndex()\">Volver</button>\n");
      out.write("        </div>\n");
      out.write("    <script>\n");
      out.write("        function goToIndex() {\n");
      out.write("            window.location.href = \"index.html\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
