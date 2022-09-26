package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.Clock;

public class DBConnection {
    Connection connection;
    static String bd = "easytrip";
    static String port = "3307";
    static String login = "root";
    static String password = "admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:"+ this.port+"/"+this.bd;
            connection = DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Conexión establecida");
        } catch (Exception ex) {
            System.out.println("Error en conexión");
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public void desconectar(){
        connection = null;
    }
}
