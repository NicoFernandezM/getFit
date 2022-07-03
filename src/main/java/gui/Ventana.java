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

    protected JTextField generarCampoDeTexto(int x, int y, int ancho, int largo) {
        JTextField campoDeTexto = new JTextField();
        this.add(campoDeTexto);
        campoDeTexto.setBounds(x, y, ancho, largo);
        campoDeTexto.setVisible(true);
        return campoDeTexto;
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
    protected JPasswordField generarCampoDeTextoContraseña(int x, int y, int ancho, int largo) {
        JPasswordField campoDeTexto = new JPasswordField();
        this.add(campoDeTexto);
        campoDeTexto.setBounds(x, y, ancho, largo);
        campoDeTexto.setVisible(true);
        return campoDeTexto;
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

    /**,
     * Este metodo genera un JTextArea y lo agrega a la ventana que lo esta llamando.
     * @param texto Es el "texto" que vendra en el JTextArea por defecto.
     * @param x Es la posición en "x" en que se creará el JTextArea de la ventana.
     * @param y Es la posición en "y" en que se creará el JTextArea de la ventana.
     * @param ancho Es el ancho que tendrá el JTextArea.
     * @param largo Es el alto que tendrá el JTextArea.
     * @param fuente Es el nombre de la fuente que tendrá el texto dentro del JTextArea.
     * @param tamaño Es el tamaño de la fuente que tendrá el texto dentro del JTextArea.
     * @return
     */

    protected  JTextArea generarArea(String texto, int x,int y,int ancho,int largo, String fuente,int tamaño){
        JTextArea area = new JTextArea(texto);
        this.add(area);
        area.setBounds(x,y,ancho,largo);
        Font myFont2 = new Font(fuente, Font.BOLD, tamaño);
        area.setFont(myFont2);
        area.setEditable(false);
        return area;

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