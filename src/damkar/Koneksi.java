package damkar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection mySql_konek;
    
    // Membuka koneksi database
    public static Connection db_koneksi() throws SQLException {
        if (mySql_konek == null || mySql_konek.isClosed()) {
            String dB = "jdbc:mysql://localhost:3306/db_damkar";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mySql_konek = DriverManager.getConnection(dB, user, pass);
        }
        return mySql_konek;
    }

    // Menutup koneksi database
    public static void closeConnection() throws SQLException {
        if (mySql_konek != null && !mySql_konek.isClosed()) {
            mySql_konek.close();
        }
    }
}
