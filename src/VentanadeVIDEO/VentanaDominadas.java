package VentanadeVIDEO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaDominadas {

    public VentanaDominadas() throws IOException {
        iniciarcomponentes();
    }

    public static void iniciarcomponentes() throws IOException {
        JFrame ventana = new JFrame();

        JPanel PaneldeText = new JPanel();
        cambioPanel(PaneldeText);

        JTextArea Texto = new JTextArea();
        cambioTexto(Texto);


        JButton boton = new JButton("Atras");
        cambioBoton(boton, ventana);

        JButton boton2 = new JButton("Siguiente");
        cambioBoton2(boton2,ventana);

        JLabel gif = new JLabel("");
        cambioJLabel(gif);

        JLabel Titulo = new JLabel("");
        cambioTitulo(Titulo);

        Agregar(ventana, PaneldeText, boton, boton2, Texto, gif, Titulo);
    }

    private static void Agregar(JFrame ventana, JPanel PaneldeText, JButton boton, JButton boton2, JTextArea Texto, JLabel gif, JLabel Titulo) {
        ventana.setLayout(null);
        PaneldeText.add(Texto);
        ventana.add(PaneldeText);
        ventana.add(boton);
        ventana.add(Titulo);
        ventana.add(boton2);
        ventana.setVisible(true);
        ventana.add(gif);
        ventana.setBackground(Color.BLACK);
        ventana.setSize(500, 750);

        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private static void cambioPanel(JPanel PaneldeBoton) {
        PaneldeBoton.setBounds(0, 450, 500, 180);
        PaneldeBoton.setLayout(null);
    }

    private static void cambioBoton(JButton boton, JFrame ventana) {
        boton.setBounds(50, 650, 120, 40);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Videos.iniciarpantala();
                ventana.setVisible(false);
            }
        });
    }

    private static void cambioBoton2(JButton boton2, JFrame ventana) {
        boton2.setBounds(310, 650, 120, 40);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    VentanaDominadas2.iniciarcomponentes();
                    ventana.setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private static void cambioTexto(JTextArea Texto) {

        Texto.setText("Tanto los niveles de cortisol como los de testosterona aumentan linealmente \n" +
                "en respuesta al ejercicio físico.\n" +
                "Sin embargo, es de vital importancia considerarlos para alcanzar un nivel \n" +
                "específico de intensidad del ejercicio.\n" +
                "De lo contrario, los factores estresantes físicos pueden resultar en la \n" +
                "secreción excesiva de cortisol, lo que disminuye la producción de \n" +
                "testosterona." +
                "El sobreentrenamiento y la susceptibilidad a ciertas enfermedades y \n" +
                "trastornos podrían ser el resultado de un estresante extremo y un bajo nivel \n" +
                "de testosterona.");
        Texto.setFont(new Font("Arial", Font.PLAIN, 13));
        Texto.setLocation(5, 10);
        Texto.setEditable(false);
        Texto.setSize(480, 160);
    }

    private static void cambioJLabel(JLabel gif) throws IOException {


        ImageIcon a = new ImageIcon("gif\\Dominadas3.gif");
        Icon b = new ImageIcon(String.valueOf(a));
        gif.setIcon(b);
        gif.setLayout(null);
        gif.setBounds(40, 70, 500, 500);
    }

    private static void cambioTitulo(JLabel Titulo) throws IOException {
        ImageIcon w = new ImageIcon("gif\\Titulo.png");
        Icon q = new ImageIcon(String.valueOf(w));
        Titulo.setIcon(q);
        Titulo.setLayout(null);
        Titulo.setBounds(100, 20, 500, 100);
    }

}
