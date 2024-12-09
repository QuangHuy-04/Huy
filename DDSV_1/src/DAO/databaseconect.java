/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class databaseconect {

    public static Connection getconnect() throws SQLException {
        String url = "jdbc:sqlserver://HUY:1433;databaseName=DiemDanhSinhVien;encrypt=true;trustServerCertificate=true;";
        String dbUsername = "sa";
        String dbPassword = "270404";
        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
        return conn;
    }
}
