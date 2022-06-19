/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gonzalo
 */
public class conexionMySql {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            cn=(Connection) DriverManager.getConnection("jbdc:mysql://localhost/login_java_mysql");
            System.out.println("Conectado");
                
                
        }catch (Exception e){
            System.out.println("ERROR DE CONECCION BD"+ e);
        }
        return cn;
    }
}
