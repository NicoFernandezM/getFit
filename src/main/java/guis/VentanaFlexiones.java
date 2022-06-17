package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaFlexiones extends Ventana implements ItemListener, ActionListener {
    JComboBox numeroDeFlexiones;
    JButton aceptar;
    JButton regresar;

    public VentanaFlexiones () {
        super();
        numeroDeFlexiones = this.generarComboBox(4, 30, 125, 220, 150, 30);
        numeroDeFlexiones.addItemListener(this);

        aceptar = this.generarBoton("Aceptar", 125, 300, 150, 80);
        aceptar.addActionListener(this);

        regresar = this.generarBoton("<--", 20, 15, 50, 30);
        regresar.addActionListener(this);

        this.generarEtiqueta("Ingrese su máximo de repeticiones.",
                35, 100, 430,80, "Impact", 20);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar) {
            //Guardar datos y mostrar ventana de tabla.
        } else {
            this.dispose();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        }
    }
}
