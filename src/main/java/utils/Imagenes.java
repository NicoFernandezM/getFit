package utils;

import javax.swing.*;
import java.awt.*;

public class Imagenes {
    private Imagenes() {

    }

    public static ImageIcon getImagenPerfil() {
        ImageIcon iconoPerfil = new ImageIcon("./src/main/resources/user.png");
        return redimensionarImagen(50, 50, iconoPerfil);
    }

    private static ImageIcon redimensionarImagen(int ancho, int alto, ImageIcon icono) {
        Image rawImage = icono.getImage();
        Image resizedImage = rawImage.getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(resizedImage);
    }
}
