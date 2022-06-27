package controlador;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class ArchivoDeTextoControladorTest {
    @Test
    void inicioSesionTest() {
        assertEquals(false,ArchivoDeTextoControlador.getInstancia().validarUsuario("",""));
    }
    @Test
    void existeUsuarioTest(){
        assertEquals(null,ArchivoDeTextoControlador.getInstancia().usuarioExiste(""));
    }
    @Test
    void validarUsuarioTest(){
        assertEquals(false,ArchivoDeTextoControlador.getInstancia().validarUsuario("",""));
    }
}