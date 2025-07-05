package uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
                String user = "root";
                String pass = "K@dekjuli(09)"; // ganti kalau MySQL kamu pakai password

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi ke database berhasil.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}
