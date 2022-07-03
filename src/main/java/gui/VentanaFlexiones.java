package gui;

import utils.GetFitMath;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaFlexiones extends Ventana implements ItemListener, ActionListener {
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;
    private JTextArea area;
    private JComboBox numeroDeFlexiones;

    private JButton mostrarVideoBtn;
    private JButton aceptarBtn;
    private JButton regresarBtn;

    public VentanaFlexiones () {
        inicializarComponentes();
        this.generarEtiqueta("Ingrese su máximo de repeticiones.",
                35, 100, 430,80, "Impact", 20);
    }

    private void inicializarComponentes() {
        generarComboBox();
        generarBotones();
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
        numeroDeFlexiones = this.generarComboBox(4, 30, 125, 220, 150, 30);
        numeroDeFlexiones.addItemListener(this);
    }

    /**,
     * Este metodo genera el Area de texto de la Ventana
     */

    private void generarAreaTex(){
        area=this.generarArea("Recuerde descansar 2 minutos por serie"+ciclo()+"\n"+"",100,400,210,90,fuente,tamañoFuente);
    }

    /**,
     * Este metodo obtiene la opcion escogida del JComboBox y genera un  arreglo de enteros la cual es transfomada
     * a un String
     * @return un arreglo de String
     */
    private String ciclo() {
        int [] t = GetFitMath.generarRutinaFlexiones(Integer.parseInt(numeroDeFlexiones.getSelectedItem().toString()));
        String a = "";
        for (int i = 0; i < 4; i++) {

            a= a +"\n Serie "+(i+1)+": "+t[i] ;
        }
        return a;
    }


    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptarBtn) {
            generarAreaTex();
        } else if(e.getSource() == regresarBtn) {
            this.dispose();
            new VentanaPrincipal();
        } else if(e.getSource() == mostrarVideoBtn) {
            new VentanaVideosFlexiones();

        }
    }
}x