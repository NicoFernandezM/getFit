package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPerfil extends Ventana implements ActionListener {
    JButton regresar;
    JButton cerrarSesion;
    JLabel nombre;
    JLabel edad;
    JLabel maxFlexiones;
    /*protected*/ JLabel maxDominadas;
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 15;

    public VentanaPerfil() {
        regresar = this.generarBoton("<--", 20, 15, 50, 30);
        regresar.addActionListener(this);

        cerrarSesion = this.generarBoton("Cerrar sesión", 20, 500, 150, 30);
        cerrarSesion.addActionListener(this);

        nombre = this.generarEtiqueta("Nombre: ", 20, 300, 70, 20,
                this.fuente, this.tamañoFuente);
        edad = this.generarEtiqueta("Edad: ", 20, 340, 100, 20,
                this.fuente, this.tamañoFuente);
        maxFlexiones = this.generarEtiqueta("Máx. flexiones: ", 20, 380, 150, 20,
                this.fuente, this.tamañoFuente);
        maxDominadas = this.generarEtiqueta("Máx. dominadas: ", 20, 420, 150, 20,
                this.fuente, this.tamañoFuente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == regresar) {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
            this.dispose();
        } else {
            //Ventana inicio sesión Gonzalo.
        }
    }
}
