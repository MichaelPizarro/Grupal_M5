package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection(){
        Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";

        String usuario = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost/prevencion_riesgos";
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,usuario,password);

            if(conn != null){
                System.out.println("Conectado");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("No se pudo conectar a BD");
            e.printStackTrace();
        }
        return conn;
    }

}


