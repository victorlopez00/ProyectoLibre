package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDAO;
import model.UsuarioVO;

public class Servlet extends HttpServlet{
	  public void init(ServletConfig conf)
			    throws ServletException {
			    super.init(conf);
			  }

			  @Override
			  protected void doGet(HttpServletRequest req, HttpServletResponse res)
			    throws ServletException, IOException
			  {
				  String nombre=req.getParameter("nombre");
			    res.setContentType("text/html");
			    PrintWriter out = res.getWriter();
			    out.println("<html>");
			    out.println("<body>");
			    out.println("<h1>Hola usuario "+nombre+" (llamada GET)</h1>");
			    out.println("</body>");
			    out.println("</html>");
			  }

			  @Override
			  protected void doPost(HttpServletRequest req, HttpServletResponse res)
			    throws ServletException, IOException
			  {
				  UsuarioVO usuario= new UsuarioVO();
				  usuario.setNombre(req.getParameter("nombre"));
				  usuario.setPswd(req.getParameter("password"));
				  try {
					if(UsuarioDAO.getSingletonInstance().comprobarUsuario(usuario)==false) {
						 System.err.println("No existe nigun usuario con ese nombre y contraseña");
					}else {
						System.out.println("Usuario correcto");
							RequestDispatcher rd;
						
					
						req.setAttribute("nombre", usuario.getNombre());
						rd=req.getRequestDispatcher("/index.jsp");
						   rd.forward(req, res);
							
						

//					<html>
//						  <body>
//						<h1>Menu, bienvenido "+nombre+"</h1>
//						    <div>
//						<form name=\"menu\" method=\"post\" action=\"menu\">");
//						   <input type=\"submit\" class=\"pornombre\" name=\"submit\" value=\"Consultar pokemon por nombre\"/>
//						    <input type=\"submit\" class=\"porId\" name=\"submit\" value=\"Consultar pokemon por Id\"/>
//						   <input type=\"submit\" class=\"loc\" name=\"submit\" value=\"Consultar Localizacion\"
//						    
//						    </div>
//						    </body>
//						   </html>
					}
					
				} catch (SQLException e) {
				System.err.println("Error en base de datos");
					e.printStackTrace();
				}
				
			  }

}
