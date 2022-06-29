package gui;

import controlador.ArchivoDeTextoControlador;
import utils.Imagenes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends Ventana implements ActionListener {
    private JButton flexiones;
    private JButton dominadas;
    private JButton perfil;
    private JButton videos;

    public VentanaPrincipal () {
        this.setTitle("GetFit");
        this.generarEtiqueta("GetFit", 155, 100, 150,80, "Forte", 30);
        inicializarComponentes();
        //perfil.setIcon(Imagenes.getImagenPerfil());
    }

    private void inicializarComponentes() {
        generarBotones();
    }

    private void generarBotones() {
        flexiones = this.generarBoton("Flexiones", 125, 200, 150, 80);
        dominadas = this.generarBoton("Dominadas",125, 300, 150, 80);
        videos = this.generarBoton("Videos",125, 400, 150, 80);
        perfil = this.generarBoton(25, 25, 50, 50);

        flexiones.addActionListener(this);
        dominadas.addActionListener(this);
        videos.addActionListener(this);
        perfil.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == flexiones) {
            new VentanaFlexiones();
            this.dispose();
        } else if(e.getSource() == dominadas) {
            new VentanaDominadas();
            this.dispose();
        } else if(e.getSource() == videos) {
            this.dispose();
        } else {
            new VentanaPerfil();
            this.dispose();
        }
    }
}
