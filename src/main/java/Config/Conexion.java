package Config;

import java.sql.*;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Homa
 */
public class Conexion {

    Connection con = null;
    String usuario = "postgres";
    String contraseña = "usuario_root";
    String bd = "registro";
    String ip = "localhost";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(cadena, usuario, contraseña);
            //
            //System.out.println("////////////conexion establecida");
        } catch (Exception e) {
            //
           // System.err.println("/////////ERROR: " + e);
        }

    }

    public Connection getConnection() {
        return con;
    }

}
