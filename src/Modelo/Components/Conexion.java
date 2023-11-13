package Modelo.Components;

import java.sql.*;

/**
 *
 * @author atorres
 */
public class Conexion {

    private static final String DATABASE = "AUTOMAP";
    private static final String TABLE_SERVICIOS = "SERVICIOS";
    private static final String TABLE_VENTAS = "VENTAS";
    private static final String TABLE_DETALLE_VENTAS = "DETALLE_VENTAS";

    // Establecer la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://pruebas1.cjkr2pyheyda.us-east-2.rds.amazonaws.com:3306/" + DATABASE;
        String usuario = "admin";
        String contraseña = "123456789";
        return DriverManager.getConnection(url, usuario, contraseña);
    }

    public static void probarConexion() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLE_SERVICIOS;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);
                
                while (resulset.next()) {                    
                    int id = resulset.getInt("ID");
                    String nombre = resulset.getString("NOMBRE");
                    int precio = resulset.getInt("PRECIO");
                    
                    System.out.printf("%d. %s - $%d\n", id, nombre, precio);
                }
            } catch (Exception e) {
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
