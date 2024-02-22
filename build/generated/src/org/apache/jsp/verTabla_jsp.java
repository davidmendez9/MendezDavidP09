package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verTabla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/verTabla.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <table class=\"default\" border=\"10\" width=\"90%\" style=\"background-color: whitesmoke;\" align=\"center\">\n");
      out.write("        <caption style=\"color: whitesmoke;\"><strong>Próximos Partidos Sevilla FC</strong></caption>\n");
      out.write("        <tr>\n");
      out.write("            <th colspan=\"3\">SEVILLA FC</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <th>Local</th>\n");
      out.write("            <th>Visitante</th>\n");
      out.write("            <th>Fecha</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Real Madrid</td>\n");
      out.write("            <td>11/02/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Atlético de Madrid</td>\n");
      out.write("            <td>15/02/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>FC Barcelona</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>19/02/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Real Sociedad</td>\n");
      out.write("            <td>23/02/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Athletic Club</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>27/02/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Valencia CF</td>\n");
      out.write("            <td>02/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Real Betis Balompié</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>06/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Deportivo Alavés</td>\n");
      out.write("            <td>10/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Espanyol</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>14/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Levante UD</td>\n");
      out.write("            <td>18/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Cádiz CF</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>22/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Granada CF</td>\n");
      out.write("            <td>26/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Mallorca</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>30/03/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>CD Leganés</td>\n");
      out.write("            <td>03/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Real Valladolid</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>07/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>SD Huesca</td>\n");
      out.write("            <td>11/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>CA Osasuna</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>15/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Rayo Vallecano</td>\n");
      out.write("            <td>19/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Elche CF</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>23/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Villarreal CF</td>\n");
      out.write("            <td>27/04/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Real Sociedad</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>01/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Real Betis Balompié</td>\n");
      out.write("            <td>05/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Getafe CF</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>09/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Athletic Club</td>\n");
      out.write("            <td>13/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Levante UD</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>17/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>CA Osasuna</td>\n");
      out.write("            <td>21/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>SD Eibar</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>25/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>FC Barcelona</td>\n");
      out.write("            <td>29/05/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Valencia CF</td>\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>02/06/24</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td><em>Sevilla FC</em></td>\n");
      out.write("            <td>Getafe CF</td>\n");
      out.write("            <td>06/06/24</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
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
