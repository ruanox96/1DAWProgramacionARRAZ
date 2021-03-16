package fabricantes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ControladorFabricante {
	
	private static ControladorFabricante instance = null;
	public Connection conexion = null;
	
	public static ControladorFabricante getInstance () {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}

	public ControladorFabricante() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			conexion =  (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		}
		
	}
	
	public Fabricante findPrimero () {
		
		
		
	}
	
	

}
