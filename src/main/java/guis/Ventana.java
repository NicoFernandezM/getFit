package guis;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        this.setLayout(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    protected JTextField generarCampoDeTexto(int x, int y, int ancho, int largo) {
        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setBounds(x, y, ancho, largo);
        this.add(campoDeTexto);
        return campoDeTexto;
    }

    protected JButton generarBoton(String texto, int x, int y, int ancho, int largo) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, largo);
        this.add(boton);

        return boton;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int largo, String fuente, int tamaño) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        Font myFont1 = new Font(fuente, Font.BOLD, tamaño);
        etiqueta.setFont(myFont1);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int largo) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JComboBox generarComboBox(int minReps, int maxReps, int x, int y, int ancho, int largo) {
        JComboBox <String> comboBox = new JComboBox<String>();
        comboBox.setBounds(x,y,ancho,largo);
        int numeroDeReps = maxReps - minReps + 1;
        String[] numeros = new String[numeroDeReps];

        for (int i = minReps; i <= maxReps; i++) {
            numeros[i - minReps] = String.valueOf(i);
            comboBox.addItem(numeros[i - minReps]);
        }

        this.add(comboBox);

        return comboBox;
    }
}
