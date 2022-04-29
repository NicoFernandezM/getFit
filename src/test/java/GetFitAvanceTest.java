import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFitAvanceTest {
    private static int [] opciones;
    private static boolean [] validacionEsperada;

    @BeforeEach
    public void init() {
        opciones = new int[] {-5, 10, 2, 9, 24, 1};
        validacionEsperada = new boolean[] {false, false, true, false, false, true};
    }

    @Test
    public void opcionValidaTest() {
        for(int i = 0; i < opciones.length; i++) {
            assertEquals(GetFitAvance.opcionValida(opciones[i]), validacionEsperada[i]);
        }
    }
}

