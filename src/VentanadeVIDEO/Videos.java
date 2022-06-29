package VentanadeVIDEO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static java.awt.image.ImageObserver.WIDTH;

public class Videos {
    public static void main(String[] args) {
        iniciarpantala();
    }

    public static void iniciarpantala(){
        JFrame videosPrincipal = new JFrame();
        modificarventana(videosPrincipal);
        iniciarcomponentes(videosPrincipal);
    }

    private static void modificarventana(JFrame videosPrincipal) {
        videosPrincipal.setVisible(true);
        videosPrincipal.setSize(500,500);
        videosPrincipal.setLayout(null);
        videosPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void iniciarcomponentes(JFrame videosPrincipal) {
        JButton dominadas = new JButton("Dominadas");
        configuracionesdominadas(dominadas, videosPrincipal);

        JButton flexiones = new JButton("flexiones");
        configuracionesflexiones(flexiones,videosPrincipal);

        JButton volver = new JButton("Volver");
        configuracionesvolver(volver,videosPrincipal);

        videosPrincipal.add(dominadas);
        videosPrincipal.add(flexiones);
        videosPrincipal.add(volver);
    }

    private static void configuracionesvolver(JButton volver, JFrame videosPrincipal) {
        volver.setLayout(null);
        volver.setBounds(200,300,115,50);
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                videosPrincipal.setVisible(false);
                System.exit(WIDTH);
                //deberia haber una clase antes que permitiera ver el menu
            }
        });
    }

    private static void configuracionesflexiones(JButton flexiones , JFrame ventana) {
        flexiones.setLayout(null);
        flexiones.setBounds(200,200,115,50);
        flexiones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    VentanaFlexiones1.iniciarcomponentes();
                    ventana.setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private static void configuracionesdominadas(JButton dominadas,JFrame video) {
        dominadas.setLayout(null);
        dominadas.setBounds(200,100,115,50);
        dominadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    VentanaDominadas.iniciarcomponentes();
                    video.setVisible(false);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
