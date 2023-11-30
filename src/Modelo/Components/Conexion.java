package Modelo.Components;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public static Map<String, Object> obtenerDetalleVenta(int factura) {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT v.CLIENTE, v.DESCRIPCION_VENTA, v.TOTAL_VENTA, s.PRECIO "
                    + "FROM VENTAS v "
                    + "JOIN DETALLE_VENTAS dv ON v.ID = dv.ID_FACTURA "
                    + "JOIN SERVICIOS s ON dv.ID_SERVICIO = s.ID WHERE v.ID = " + factura;

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                Map<String, Object> detalle = new HashMap<>();

                String cliente = "", descripcion = "";
                int total_venta = 0, precio_servicio;

                int cont = 0;

                while (resulset.next()) {
                    cont++;

                    cliente = resulset.getString("CLIENTE");
                    descripcion = resulset.getString("DESCRIPCION_VENTA");
                    total_venta = resulset.getInt("TOTAL_VENTA");
                    precio_servicio = resulset.getInt("PRECIO");

                    detalle.put("PRECIO" + cont, precio_servicio);
                }

                detalle.put("CLIENTE", cliente);
                detalle.put("DESCRIPCION_VENTA", descripcion);
                detalle.put("TOTAL_VENTA", total_venta);

                detalle.put("cont", cont);

                return detalle;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Map<String, Object> obtenerFacturas() {
        try (Connection conexion = getConnection()) {
            String selectQuery = "SELECT * FROM " + TABLE_VENTAS + " WHERE MCA_INHABILITADO = 'N'";

            try (Statement statement = conexion.createStatement()) {
                ResultSet resulset = statement.executeQuery(selectQuery);

                Map<String, Object> facturas = new HashMap<>();
                int cont = 0;

                while (resulset.next()) {
                    cont++;

                    int id_factura = resulset.getInt("ID");
                    String cliente = resulset.getString("CLIENTE");
                    int total_venta = resulset.getInt("TOTAL_VENTA");
                    Date fecha_registro = resulset.getDate("FECHA_REGISTRO");

                    facturas.put("FACTURA" + cont, id_factura);
                    facturas.put("CLIENTE" + cont, cliente);
                    facturas.put("TOTAL_VENTA" + cont, total_venta);
                    facturas.put("FECHA_REGISTRO" + cont, fecha_registro);
                }

                facturas.put("cont", cont);

                return facturas;
            } catch (Exception e) {
                System.out.println("ups!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
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
