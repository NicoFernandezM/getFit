package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaDominadas extends Ventana implements ItemListener, ActionListener {
    private JComboBox numeroDeDominadas;
    private JButton aceptar;
    private JButton regresar;

    public VentanaDominadas () {
        numeroDeDominadas = this.generarComboBox(4, 30, 125, 220, 150, 30);
        numeroDeDominadas.addItemListener(this);

        aceptar = this.generarBoton("Aceptar", 125, 300, 150, 80);
        aceptar.addActionListener(this);

        regresar = this.generarBoton("<--", 20, 15, 50, 30);
        regresar.addActionListener(this);

        this.generarEtiqueta("Ingrese su máximo de repeticiones.",
                35, 100, 430,80, "Impact", 20);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ArchivoDeTextoControlador.getInstancia().editarUsuario(20, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar) {
            //Mostrar ventana de tabla de dominadas.
        } else {
            this.dispose();
            new VentanaPrincipal();
        }
    }


}
