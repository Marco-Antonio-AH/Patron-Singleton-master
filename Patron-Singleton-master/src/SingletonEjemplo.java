import java.sql.*;

import javax.swing.JOptionPane;

public enum SingletonEjemplo {

    INSTANCE;

    // Propiedades
    private static Connection conn = null;
    //private String driver;
    private String url;
    private String usuario;
    private String password;

    // Constructor
    private static void EjemploSingleton() {

        String url = "jdbc:mysql://localhost:3306/singleton";
        //String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String password = "";

        try {
            //Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión aceptada...");
        } catch (Exception e) {
            System.out.println("Mensaje de error: "+e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }

        //return conn;
    } // Fin constructor

    // Métodos
    public static Connection getConnection() {

        if (conn == null) {
            EjemploSingleton();
        }

        return conn;
    } // Fin getConnection

}
