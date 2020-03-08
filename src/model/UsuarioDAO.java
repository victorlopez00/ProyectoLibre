package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
	public static UsuarioDAO usuarioDAO;
	static ConexionJDBC conex;
	
	private UsuarioDAO() {
		
	}
	public static UsuarioDAO getSingletonInstance() {
		if(usuarioDAO==null) {
			usuarioDAO=new UsuarioDAO();
			conex = new ConexionJDBC();
			
		}
		return usuarioDAO;
	}
	
	public boolean comprobarUsuario(UsuarioVO usuario) throws SQLException {
		
	       		Connection conn = conex.getConnection();
				Statement comando = conn.createStatement();
				ResultSet rs = comando.executeQuery("select * from usuarios where nombre='"+usuario.getNombre()+"' and pswd='"+usuario.getPswd()+"'; ");
				while (rs.next()) {
					if (rs.getRow() > 0) {
						return true;
					} else {
						return false;
					}
				}
				comando.close();
				return false;
		 
	

	}
}
