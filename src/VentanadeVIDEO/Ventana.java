package VentanadeVIDEO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Ventana {
    private String Imagen1 = "https://i.pinimg.com/originals/05/b2/74/05b274ce4e818ddbee34dee6ac785b5f.gif";
    private String Imagen2 = "https://drive.google.com/file/d/1iLwKzmPnlosukGUZM0IA01a2ceyzwuH9/view?usp=sharing";


    public Ventana() throws IOException {
        iniciarcomponentes();
    }

    private void iniciarcomponentes() throws IOException {


        JPanel PaneldeBoton2 = new JPanel();cambioPanel2(PaneldeBoton2);

        JPanel PaneldeBoton = new JPanel();
        cambioPanel(PaneldeBoton);

        JTextArea Texto = new JTextArea();
        cambioTexto(Texto);


        JButton boton2 = new JButton("Otro");
        cambioBoton(boton2);

        JLabel gif = new JLabel("");
        cambioJLabel(gif);

        JLabel Titulo = new JLabel("");
        cambioTitulo(Titulo);

        Agregar(PaneldeBoton2,PaneldeBoton,boton2,Texto,gif,Titulo);
    }
    private void cambioPanel(JPanel PaneldeBoton) {
        PaneldeBoton.setBounds(0, 450, 500, 180);
        PaneldeBoton.setLayout(null);
    }
    private void cambioPanel2(JPanel PaneldeBoton2) {
        PaneldeBoton2.setBounds(0, 640, 500, 50);
        PaneldeBoton2.setLayout(null);
    }
    public void Agregar(JPanel PaneldeBoton2,JPanel PaneldeBoton, JButton boton2,JTextArea Texto, JLabel gif,JLabel Titulo){
        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        PaneldeBoton2.add(boton2);
        PaneldeBoton.add(Texto);
        ventana.add(PaneldeBoton);
        ventana.add(PaneldeBoton2);

        ventana.setVisible(true);
        ventana.add(gif);
        ventana.setBackground(Color.BLACK);
        ventana.add(Titulo);
        ventana.setSize(500, 750);

        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void cambioBoton(JButton boton2) {
        boton2.setBounds(180, 15, 89, 23);
    }

    private void cambioTexto(JTextArea Texto) {

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
        Texto.setLocation(5, 50);
        Texto.setSize(480, 160);
    }

    public void cambioJLabel(JLabel gif) throws IOException {
        URL a = new URL(Imagen1);
        Icon b = new ImageIcon(a);
        gif.setIcon(b);
        gif.setLayout(null);
        gif.setBounds(0,70,500,500);
           }

    public void cambioTitulo(JLabel Titulo) throws IOException{
        URL w = new URL(Imagen2);
        Icon q = new ImageIcon(w);
        Titulo.setIcon(q);
        Titulo.setLayout(null);
        Titulo.setBounds(50,20,500,100);
    }



    public static void main(String[] args) throws IOException {
        Ventana a = new Ventana();


    }
}
