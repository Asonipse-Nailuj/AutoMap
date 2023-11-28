package Modelo.Components;

import java.sql.*;
import java.util.ArrayList;

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
        String url = "jdbc:mysql://viaduct.proxy.rlwy.net:49481/" + DATABASE;
        String usuario = "root";
        String contraseña = "F3eehhE-3gGHCDdBbfCbDdDbHhfDBEA5";
        return DriverManager.getConnection(url, usuario, contraseña);
    }

    public static int insertarVenta(String cliente, IServicios venta, ArrayList<Integer> servicios) {
        int idGenerado = 0;

        try (Connection conexion = getConnection()) {
            String insertQuery = "INSERT INTO " + TABLE_VENTAS + " (CLIENTE, DESCRIPCION_VENTA, TOTAL_VENTA) VALUES (?,?,?)";

            // Habilitar la recuperación de la clave primaria generada
            try (PreparedStatement statement = conexion.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, cliente.toUpperCase());
                statement.setString(2, venta.getDescripcion());
                statement.setInt(3, venta.getPrecio());
                statement.executeUpdate();

                try ( // Recuperar las claves generadas
                        ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        idGenerado = generatedKeys.getInt(1); // Obtener el valor de la clave primaria
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insertarDetalleVenta(idGenerado, servicios);

        return idGenerado;
    }

    private static void insertarDetalleVenta(int factura, ArrayList<Integer> servicios) {
        try (Connection conexion = getConnection()) {
            for (int servicio : servicios) {
                String insertQuery = "INSERT INTO " + TABLE_DETALLE_VENTAS + "(ID_FACTURA, ID_SERVICIO) VALUES (?,?)";
                try (PreparedStatement statement = conexion.prepareStatement(insertQuery)) {
                    statement.setInt(1, factura);
                    statement.setInt(2, servicio);
                    statement.executeUpdate();
                }
            }

            System.out.println("Registros creados exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void probarConexion() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLE_SERVICIOS;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                while (resulset.next()) {
                    int id = resulset.getInt("ID");
                    String nombre = resulset.getString("DESCRIPCION");
                    int precio = resulset.getInt("PRECIO");

                    System.out.printf("%d. %s - $%d\n", id, nombre, precio);
                }
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
