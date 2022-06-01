import java.util.InputMismatchException;
import java.util.Scanner;
    //En este código de prueba solo se admiten ciertos inputs.
//Dominadas 4 a 7
//Flexiones 10 a 13
    public class GetFitAvance {
        static final int[][] tablaDominadas = new int[][]{
                {3, 3, 2, 3},//Esta tabla considera los casos en el que el máximo de dominadas es de 4 a 7.
                {4, 3, 3, 3},
                {4, 4, 4, 3},
                {5, 5, 4, 4}
        };

        static final int[][] tablaFlexiones = new int[][]{
                {6, 6, 5, 5},//Esta tabla considera los casos en el que el máximo de flexiones es de 10 a 13.
                {6, 6, 5, 6},
                {7, 6, 5, 5},
                {7, 7, 6, 5}
        };

        public void menu() {
            int opcion = elegirOpcion();
            mostrarMenu(opcion);
        }

        public static void imprimirMenu() {
            System.out.println("""
                    Por favor elija una opción.
                    1. Dominadas
                    2. Flexiones de brazos
                    3. Salir""");
        }

        public static int elegirOpcion() {
            int opcion;

            do {
                imprimirMenu();
                opcion = ingresarInput();
            } while (!opcionValida(opcion));

            return opcion;
        }

        public static boolean opcionValida(int opcion) {
            return opcion >= 1 && opcion <= 3;
        }

        public static int ingresarInput() {
            Scanner scanner = new Scanner(System.in);

            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                return -1;
            }
        }

        public static void mostrarMenu(int opcion) {
            switch (opcion) {
                case 1 -> dominadas();
                case 2 -> flexiones();
                default -> {
                }
            }
        }

        public static void dominadas() {
            int maxDominadas = pedirMaximo();
            mostrarTablaDominadas(maxDominadas);
        }

        public static void mostrarTablaDominadas(int maxDominadas) {
            for (int j = 0; j < tablaDominadas[maxDominadas - 4].length; j++) {
                System.out.println("Serie " + (j + 1) + ": " + tablaDominadas[maxDominadas - 4][j] + " reps.");
            }
        }

        public static void flexiones() {
            int maxFlexiones = pedirMaximo();
            mostrarTablaFlexiones(maxFlexiones);
        }

        public static void mostrarTablaFlexiones(int maxFlexiones) {
            for (int j = 0; j < tablaFlexiones[maxFlexiones - 10].length; j++) {
                System.out.println("Serie " + (j + 1) + ": " + tablaFlexiones[maxFlexiones - 10][j] + " reps.");
            }
        }

        public static int pedirMaximo() {
            int maximo;

            do {
                System.out.println("Por favor ingrese máximo realizado");
                maximo = ingresarInput();
            } while (maximo < 0);

            return maximo;
        }

    }