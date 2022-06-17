package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends Ventana implements ActionListener {
    private JButton flexiones;
    private JButton dominadas;
    private JButton perfil;
    private JButton videos;

    public VentanaPrincipal () {
        super();
        flexiones = this.generarBoton("Flexiones", 125, 200, 150, 80);
        dominadas = this.generarBoton("Dominadas",125, 300, 150, 80);
        videos = this.generarBoton("Videos",125, 400, 150, 80);
        perfil = this.generarBoton("P", 25, 25, 50, 50);



        flexiones.addActionListener(this);//Es necesario hacer esto acá? No se puede hacer en la
        //clase ventana?
        dominadas.addActionListener(this);
        videos.addActionListener(this);
        perfil.addActionListener(this);

        this.generarEtiqueta("GetFit", 155, 100, 150,80, "Forte", 30);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == flexiones) {
            VentanaFlexiones ventanaFlexiones = new VentanaFlexiones();
            this.dispose();
        } else if(e.getSource() == dominadas) {
            VentanaDominadas ventanaFlexiones = new VentanaDominadas();
            this.dispose();
        } else if(e.getSource() == videos) {
            this.dispose();
        } else {
            VentanaPerfil ventanaPerfil = new VentanaPerfil();
            this.dispose();
        }


    }
}
