package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class VentanaInicioSesion extends Ventana implements ActionListener {
    private JButton iniciarSesionBtn;
    private JButton regresarBtn;

    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;

    private JTextField usuario;
    private JPasswordField contraseña;

    public VentanaInicioSesion() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        generarBotones();
        generarEtiquetas();
        generarCamposDeTexto();
    }

    private void generarBotones() {
        regresarBtn = this.generarBoton("<--", 20, 15, 50, 30);
        regresarBtn.addActionListener(this);

        iniciarSesionBtn = this.generarBoton("Iniciar sesión", 140, 400, 120, 50);
        iniciarSesionBtn.addActionListener(this);
    }

    private void generarCamposDeTexto() {
        this.usuario = this.generarCampoDeTexto(100, 250, 200, 20);
        this.contraseña = this.generarCampoDeTextoContraseña(100, 300, 200, 20);
    }

    private void generarEtiquetas() {
        this.generarEtiqueta("Inicio de sesión", 90, 100, 300,80,
                "Forte", 30);

        this.generarEtiqueta("Usuario: ", 20, 250, 70, 20,
                this.fuente, this.tamañoFuente);

        this.generarEtiqueta("Contraseña: ", 20, 300, 70, 20,
                this.fuente, this.tamañoFuente);
    }

    private boolean entradasVacias() {
        return (this.usuario.getText().isEmpty() && obtenerContraseña().isEmpty());
    }

    private String obtenerContraseña() {
        String contraseña = Arrays.toString(this.contraseña.getPassword());

        return String.join(",", contraseña).
                replaceAll("\\p{Punct}", "").replaceAll(" ", "");
    }

    private boolean usuarioValido() {
        return ArchivoDeTextoControlador.getInstancia().validarUsuario(this.usuario.getText(), obtenerContraseña());
    }

    private void iniciarSesion() {
        if(usuarioValido() && !entradasVacias()) {
            new VentanaPrincipal();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta",
                    "Ingreso inválido", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iniciarSesionBtn) {
            iniciarSesion();
        } else if(e.getSource() == regresarBtn) {
            new VentanaLogin();
            this.dispose();
        }
    }
}
