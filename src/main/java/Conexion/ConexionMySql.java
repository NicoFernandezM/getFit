package Conexion;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql {
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
