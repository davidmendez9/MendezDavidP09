package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Principal.Jugador;
import java.util.List;

public final class verLista_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Lista</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/verLista.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Lista de Jugadores de fútbol</h1>\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("        ");
 List<Jugador> listaJugadores = Jugador.obtenerListaJugadores(); 
      out.write("\n");
      out.write("        ");
 for (Jugador jugador : listaJugadores) { 
      out.write("\n");
      out.write("            <article>\n");
      out.write("                <h3>");
      out.print( jugador.getNombre() );
      out.write("</h3>\n");
      out.write("                <p>Nombre: ");
      out.print( jugador.getNombre() );
      out.write("</p>\n");
      out.write("                <p>País: ");
      out.print( jugador.getPais() );
      out.write("</p>\n");
      out.write("                <p>Posición: ");
      out.print( jugador.getPosicion() );
      out.write("</p>\n");
      out.write("                <p>Goles: ");
      out.print( jugador.getGoles() );
      out.write("</p>\n");
      out.write("            </article>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <h1>Máximos goleadores por país</h1>\n");
      out.write("    <section>\n");
      out.write("        ");
 List<Jugador> maximosGoleadores = Jugador.obtenerMaximosGoleadores(); 
      out.write("\n");
      out.write("        ");
 for (Jugador jugador : maximosGoleadores) { 
      out.write("\n");
      out.write("            <article>\n");
      out.write("                <h3>");
      out.print(jugador.getPais());
      out.write("</h3>\n");
      out.write("                <h4>");
      out.print( jugador.getNombre() );
      out.write("</h4>\n");
      out.write("                <p>Nombre: ");
      out.print( jugador.getNombre() );
      out.write("</p>\n");
      out.write("                <p>Posición: ");
      out.print( jugador.getPosicion() );
      out.write("</p>\n");
      out.write("                <p>Goles: ");
      out.print( jugador.getGoles() );
      out.write("</p>\n");
      out.write("            </article>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <a href=\"index.html\">Volver</a>\n");
      out.write("</body>\n");
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
