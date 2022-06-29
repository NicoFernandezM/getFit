package gui;

import javax.swing.*;
import java.awt.*;

public abstract class Ventana extends JFrame {

    public Ventana() {
        this.setLayout(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("GetFit");
    }

    protected JTextField generarCampoDeTexto(int x, int y, int ancho, int alto) {
        JTextField campoDeTexto = new JTextField();
        this.add(campoDeTexto);
        campoDeTexto.setBounds(x, y, ancho, alto);
        campoDeTexto.setVisible(true);
        return campoDeTexto;
    }

    protected JPasswordField generarCampoDeTextoContraseña(int x, int y, int ancho, int alto) {
        JPasswordField campoDeTexto = new JPasswordField();
        this.add(campoDeTexto);
        campoDeTexto.setBounds(x, y, ancho, alto);
        campoDeTexto.setVisible(true);
        return campoDeTexto;
    }

    protected JButton generarBoton(String texto, int x, int y, int ancho, int alto) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, alto);
        this.add(boton);

        return boton;
    }

    protected JButton generarBoton(int x, int y, int ancho, int alto) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        this.add(boton);

        return boton;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int alto, String fuente, int tamaño) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, alto);
        Font font = new Font(fuente, Font.BOLD, tamaño);
        etiqueta.setFont(font);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JTextArea generarAreaDeTexto (String texto, int x, int y, int ancho, int alto, String fuente, int tamaño) {
        JTextArea areaDeTexto = new JTextArea(texto);

        areaDeTexto.setBounds(x, y, ancho, alto);
        Font font = new Font(fuente, Font.BOLD, tamaño);
        areaDeTexto.setFont(font);
        areaDeTexto.setEditable(false);
        this.add(areaDeTexto);

        return areaDeTexto;
    }

    protected JLabel generarLabelConGif(String direccion, int x, int y, int ancho, int alto) {
        ImageIcon imageIcon = new ImageIcon(direccion);
        Icon icon = new ImageIcon(String.valueOf(imageIcon));
        JLabel gif = new JLabel();
        this.add(gif);
        gif.setIcon(icon);
        gif.setLayout(null);
        gif.setBounds(x, y, ancho, alto);

        return gif;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int alto) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, alto);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JComboBox generarComboBox(int minReps, int maxReps, int x, int y, int ancho, int alto) {
        JComboBox <String> comboBox = new JComboBox<String>();
        comboBox.setBounds(x,y,ancho,alto);
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