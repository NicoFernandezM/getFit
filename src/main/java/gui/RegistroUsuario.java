package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class RegistroUsuario extends Ventana implements ActionListener {
    private JButton registrarBtn;
    private JButton regresarBtn;

    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;

    private JTextField nombre;
    private JTextField apellido;
    private JTextField usuario;
    private JPasswordField contraseña;
    private JTextField edad;

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

    public boolean entradasValidas() {
        return (nombreValido() && !entradasVacias() && edadValida());
    }

    public boolean nombreValido() {
        String nombre = unirNombreYApellido().replaceAll(" ","");
        return (nombre.matches("[a-zA-Z]+"));
    }

    public String unirNombreYApellido() {
        return this.nombre.getText().replaceAll(" ","") + " " +
                this.apellido.getText().replaceAll(" ","");
    }

    public boolean entradasVacias() {
        return (this.nombre.getText().isEmpty() && this.apellido.getText().isEmpty() &&
                this.usuario.getText().isEmpty() && obtenerContraseña().isEmpty() &&
                this.edad.getText().isEmpty());
    }

    public String obtenerUsuario() {
        return this.usuario.getText().replaceAll(" ","");
    }

    public String obtenerContraseña() {
        String contraseña = Arrays.toString(this.contraseña.getPassword());

        return String.join(",", contraseña).
                replaceAll("\\p{Punct}", "").replaceAll(" ", "");
    }

    public boolean edadValida() {
        try {
            int edad = Integer.parseInt(this.edad.getText());
            return edad < 120 && edad > 0;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public void limpiarTextField() {
        nombre.setText("");
        apellido.setText("");
        usuario.setText("");
        contraseña.setText("");
        edad.setText("");
    }

    public boolean usuarioExiste() {
        ArchivoDeTextoControlador c = ArchivoDeTextoControlador.getInstancia();
        return c.usuarioExiste(this.usuario.getText()) != null;
    }

    public void registrarUsuario() {
        ArchivoDeTextoControlador controlador = ArchivoDeTextoControlador.getInstancia();

        try {
            if(!usuarioExiste() && entradasValidas()) {
                controlador.registrarUsuario(obtenerUsuario(), obtenerContraseña(),
                        unirNombreYApellido(), Integer.parseInt(this.edad.getText()));

                new VentanaPrincipal();
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(this, "Entradas inválidas",
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
