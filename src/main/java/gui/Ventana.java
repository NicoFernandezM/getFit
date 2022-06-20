package gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    protected JTextField generarCampoDeTexto(int x, int y,int ancho,int largo){
        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setBounds(x, y, ancho, largo);
        this.add(campoDeTexto);
        return campoDeTexto;
    }

    protected JPasswordField generarCampoDeTexto2(int x, int y,int ancho,int largo){
        JPasswordField campoDeTexto2 = new JPasswordField();
        campoDeTexto2.setBounds(x, y, ancho, largo);
        this.add(campoDeTexto2);
        return campoDeTexto2;
    }

    protected JButton generarBoton(String texto, int x, int y, int ancho, int largo) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, largo);
        this.add(boton);

        return boton;
    }

    protected JButton generarBoton(int x, int y, int ancho, int largo) {
        JButton boton = new JButton();
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


}

