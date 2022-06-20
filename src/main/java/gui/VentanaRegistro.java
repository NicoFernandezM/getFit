package gui;
import Conexion.ConexionMySql;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VentanaRegistro extends Ventana implements ActionListener {

    Conexion.ConexionMySql con =new ConexionMySql();

    Connection cn = (Connection) con.conectar();

    JButton Aceptar;

    JButton Cancelar;
    JLabel Usuario;

    JLabel Apellido;
    JLabel email;
    JLabel contraseña;
    JTextField datosUsuario;
    JTextField datosApellido;
    JTextField datosEmail;
    JPasswordField datosContraseña;
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;
    public VentanaRegistro(){
        Usuario = this.generarEtiqueta("Usuario: ", 20, 150, 70, 20,
                this.fuente, this.tamañoFuente);
        Apellido = this.generarEtiqueta("Apellido: ", 20, 200, 70, 20,
                this.fuente, this.tamañoFuente);
        email = this.generarEtiqueta("email: ", 20, 250, 70, 20,
                this.fuente, this.tamañoFuente);
        contraseña = this.generarEtiqueta("Contraseña: ", 20, 300, 70, 20,
                this.fuente, this.tamañoFuente);
        Cancelar = this.generarBoton("Cancelar", 200, 400, 100, 30);
        Cancelar.addActionListener(this);
        Aceptar = this.generarBoton("Aceptar", 100, 400, 100, 30);
        Aceptar.addActionListener(this);
        datosUsuario = this.generarCampoDeTexto(80, 150, 100, 20);
        datosApellido = this.generarCampoDeTexto(80, 200, 100, 20);
        datosEmail = this.generarCampoDeTexto(80, 250, 100, 20);
        datosContraseña = this.generarCampoDeTexto2(80, 300, 100, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Aceptar){
            String Usuario = datosUsuario.getText();
            String Email = datosEmail.getText();
            String Apellido= datosApellido.getText();
            String Contraseña = datosContraseña.getText();

            if(Usuario.isEmpty()||Apellido.isEmpty()||Email.isEmpty()||Contraseña.isEmpty()){
                JOptionPane.showMessageDialog(null,"Datos Imcompletos");
            }else{
                try {
                    String consulta = "INSERT INTO usuarios (nombre,apellido,email,clave) VALUES('"+Usuario+"','"+Apellido+"','"+Email+"','"+Contraseña+"')";
                    PreparedStatement ps =cn.prepareStatement(consulta);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null,"Datos Guardados Exitosamente");
                }catch (Exception em){
                    JOptionPane.showMessageDialog(null,"NO SE PUDO GUARDAR USUARIO");

                }
            }
        }

    }
    void limpiar(){
        datosUsuario.setText("");
        datosApellido.setText("");
        datosContraseña.setText("");
        datosEmail.setText("");
    }
}
