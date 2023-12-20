/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swing;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HEMANATHAN
 */
public class Db 
{

    Connection conn = null;
    
    public static Connection dbConnection()
    {
        try 
        {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empman","root","solohema");
            return conn;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
