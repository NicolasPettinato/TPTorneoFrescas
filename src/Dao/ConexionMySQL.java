package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/torneofrescas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;


    public static Connection getConnection() {
        return connection;
    }

    public static void conexion() {
        try {
            Class.forName(DATABASE_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            System.out.println("Conectado Correctamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

}
