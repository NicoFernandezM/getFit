package Modelo;

public class Arreglo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double[] a= numeroDominadas(i);
            System.out.println("["+i+"]");
            for (int j = 0; j < a.length; j++) {
                System.out.print("["+Math.round(a[j])+"]");
            }
            System.out.println("");
        }
    }

    public static double[] numeroDominadas(int numMax) {
        double[] a = new double[4];
        double[] b = {0.7,0.5,0.3,0.1};
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i]*(numMax-2);
        }
        return a;
    }
    public static double[] numeroFlexiones(int numMax) {
        double[] a = new double[4];
        double[] b = {1,0.6,0.4,0.2};
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.round(b[i]*(numMax-2));
        }
        return a;
    }
}
