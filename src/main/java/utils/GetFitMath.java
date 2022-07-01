package utils;

public class GetFitMath {

    public static int [] generarRutinaDominadas(int numeroIngresado) {
        int [] cadena = new int[]{2, 1, 2, 1};

        if(numeroIngresado == 4) {
            return cadena;
        } else {
            for(int i = 4; i < numeroIngresado; i++) {
                if(i % 4 == 0) {
                    i /= 4;
                    i--;
                    numeroIngresado -= 4;
                }
                cadena[i] = numeroIngresado > 4  && numeroIngresado < 9 ? cadena[i] + 1 : cadena[i] + 3;
            }

            return cadena;
        }
    }

    public static int [] generarRutinaFlexiones(int numeroIngresado) {
        int [] cadena = new int[]{2, 1, 2, 1};

        if(numeroIngresado == 4) {
            return cadena;
        } else {
            for(int i = 4; i < numeroIngresado; i++) {
                if(i % 4 == 0) {
                    i /= 4;
                    i--;
                    numeroIngresado -= 4;
                }
                cadena[i] = numeroIngresado > 4  && numeroIngresado < 9 ? cadena[i] + 1 : cadena[i] + 3;
            }

            return cadena;
        }
    }
}
