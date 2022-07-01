package gui;

import controlador.ArchivoDeTextoControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaDominadas extends Ventana implements ItemListener, ActionListener {
    private JComboBox numeroDeDominadas;

    private JButton mostrarVideoBtn;
    private JButton aceptarBtn;
    private JButton regresarBtn;

    public VentanaDominadas () {
        inicializarComponentes();
        this.generarEtiqueta("Ingrese su máximo de repeticiones.",
                35, 100, 430,80, "Impact", 20);
    }

    private void inicializarComponentes() {
        generarBotones();
        generarComboBox();
    }

    private void generarBotones() {
        mostrarVideoBtn = this.generarBoton("Ver video explicativo.", 100, 15, 270, 30);
        mostrarVideoBtn.addActionListener(this);

        aceptarBtn = this.generarBoton("Aceptar", 125, 300, 150, 80);
        aceptarBtn.addActionListener(this);

        regresarBtn = this.generarBoton("<--", 20, 15, 50, 30);
        regresarBtn.addActionListener(this);
    }

    private void generarComboBox() {
        numeroDeDominadas = this.generarComboBox(4, 30, 125, 220, 150, 30);
        numeroDeDominadas.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ArchivoDeTextoControlador.getInstancia().editarUsuario(20, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptarBtn) {
            //Mostrar tabla gonzalo
        } else if(e.getSource() == regresarBtn) {
            this.dispose();
            new VentanaPrincipal();
        } else if(e.getSource() == mostrarVideoBtn) {
            //Mostrar videos Juan
        }
    }


}
