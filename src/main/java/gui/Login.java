package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Ventana implements ActionListener {

    JButton Ingresar;
    JButton Registrar;
    JLabel Usuario;
    JLabel Contraseña;

    JPasswordField contraseña;

    JTextField dato;
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;

    public Login(){
        Ingresar = this.generarBoton("Ingresar", 80, 400, 100, 30);
        Ingresar.addActionListener(this);
        Registrar = this.generarBoton("Registrar", 200, 400, 100, 30);
        Registrar.addActionListener(this);

        Usuario = this.generarEtiqueta("Usuario: ", 20, 150, 70, 20,
                this.fuente, this.tamañoFuente);
        Contraseña = this.generarEtiqueta("Contraseña: ", 20, 200, 70, 20,
                this.fuente, this.tamañoFuente);
        contraseña = this.generarCampoDeTexto2(100,200,200,20);
        dato = this.generarCampoDeTexto(100,150,200,20);

        Registrar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Registrar){
            VentanaRegistro ventanaRegistro = new VentanaRegistro();
        }

    }
}
