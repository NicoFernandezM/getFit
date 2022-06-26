package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistroUsuario extends Ventana implements ActionListener {
    private JButton registrarBtn;
    private JButton regresarBtn;

    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;

    JTextField nombre;
    JTextField apellido;
    JTextField usuario;
    JPasswordField contraseña;
    JTextField edad;

    public RegistroUsuario() {
        this.generarEtiqueta("Registrar", 130, 50, 150,80, "Forte", 35);

        regresarBtn = this.generarBoton("<--", 20, 15, 50, 30);
        regresarBtn.addActionListener(this);

        registrarBtn = this.generarBoton("Registrar", 150, 400, 100, 50);
        registrarBtn.addActionListener(this);

        this.generarEtiqueta("Nombre: ", 20, 150, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Apellido: ", 20, 200, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Usuario: ", 20, 250, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Contraseña: ", 20, 300, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Edad: ", 20, 350, 70, 20,
                this.fuente, this.tamañoFuente);

        this.nombre = this.generarCampoDeTexto(100, 150, 200, 20);
        this.apellido = this.generarCampoDeTexto(100, 200, 200, 20);
        this.usuario = this.generarCampoDeTexto(100, 250, 200, 20);
        this.contraseña = this.generarCampoDeTextoContraseña(100, 300, 200, 20);
        this.edad = this.generarCampoDeTexto(100, 350, 200, 20);


    }

    public void limpiarTextField() {
        nombre.setText("");
        apellido.setText("");
        usuario.setText("");
        contraseña.setText("");
        edad.setText("");
    }

    public void registrarUsuario() {
        ArchivoDeTextoControlador controlador = ArchivoDeTextoControlador.getInstancia();

        try {
            if(controlador.usuarioExiste(this.usuario.getText()) == null) {
                controlador.registrarUsuario(this.usuario.getText(), this.contraseña.getText(),
                        this.nombre.getText(), Integer.parseInt(this.edad.getText()));

                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(this, "Nombre de usuario ya existe",
                        "Ingreso inválido", JOptionPane.WARNING_MESSAGE);
                limpiarTextField();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == registrarBtn) {
            registrarUsuario();

        } else if (e.getSource() == regresarBtn) {
            this.dispose();
            VentanaLogin ventanaLogin = new VentanaLogin();
        }
    }
}
