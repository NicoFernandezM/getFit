package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistroUsuario extends Ventana implements ActionListener {
    private JButton registrar;
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;
    JTextField nombre;
    JTextField apellido;
    JTextField usuario;
    JTextField contraseña;
    JTextField edad;

    public RegistroUsuario() {
        registrar = this.generarBoton("Registrar", 150, 350, 100, 80);
        registrar.addActionListener(this);

        this.generarEtiqueta("Nombre: ", 20, 100, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Apellido: ", 20, 150, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Usuario: ", 20, 200, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Contraseña: ", 20, 250, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Edad: ", 20, 300, 70, 20,
                this.fuente, this.tamañoFuente);

        this.nombre = this.generarCampoDeTexto(100, 100, 70, 20);
        this.apellido = this.generarCampoDeTexto(100, 150, 70, 20);
        this.usuario = this.generarCampoDeTexto(100, 200, 70, 20);
        this.contraseña = this.generarCampoDeTexto(100, 250, 70, 20);
        this.edad = this.generarCampoDeTexto(100, 300, 70, 20);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == registrar) {
            try {
                if(!ArchivoDeTextoControlador.getInstancia().usuarioExiste(this.usuario.getText())) {
                    ArchivoDeTextoControlador.getInstancia().registrarUsuario(this.usuario.getText(), this.contraseña.getText(),
                            this.nombre.getText(), Integer.parseInt(this.edad.getText()));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.dispose();
        }
    }
}
