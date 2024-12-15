package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConnection {
    
    private Connection connection;
    private String idActual;
    
    private final String usuario = "root";
    private final String contrasenia = "220204";
    private final String bd = "db_venegas_style";
    private final String ip = "localhost";
    private final String puerto = "3306";
    
    private final String url = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useSSL=false&serverTimezone=UTC";
    
    public Connection estableceConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: Driver no encontrado. " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos: " + e.getMessage());
        }
        return connection;
    }
    
    public void setIdActual(String id) {
        this.idActual = id;
    }

    public String getIdActual() {
        return this.idActual;
    }
    
    public void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada correctamente");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
