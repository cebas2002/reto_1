package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection connection;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String usuario = "root";
    private String contraseña = "";
    private String urlConexion = "jdbc:mysql://localhost:3306/reto_1";
            
    public Conexion() {
        try {
            Class.forName(driver);
            connection=DriverManager.getConnection(urlConexion, usuario, contraseña);
            if (connection != null){
                System.out.println("conexion exitosa con la base de datos");
            }
        } catch (ClassNotFoundException | SQLException  e) {
            System.out.println("error en la conecion " + e);
            
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
}
