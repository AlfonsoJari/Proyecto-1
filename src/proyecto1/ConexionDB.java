package proyecto1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {

    private static ConexionDB con = null;

    public static ConexionDB getInstance() {
        if (con == null) {
            con = new ConexionDB();
        }
        return con;
    }

    private Connection conn = null;

    private ConexionDB() {
        String url = "jdbc:postgresql://127.0.0.1:5432/javacrud";
        try {
            conn = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        System.out.println("La conexion se realizo sin problemas");
    }

    public boolean execute(String sql) {
        boolean res = false;
        try {
            Statement st = conn.createStatement();
            st.execute(sql);
            res = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
