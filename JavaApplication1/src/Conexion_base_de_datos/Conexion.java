/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion_base_de_datos;

import java.sql.*;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Owner
 */

public class Conexion {
   Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/horarios","root","");
           System.out.println("conexion establecida");
           JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }
}
