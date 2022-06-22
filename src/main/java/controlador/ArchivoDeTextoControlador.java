package controlador;

import modelo.Usuario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ArchivoDeTextoControlador {
    private static ArchivoDeTextoControlador instancia = null;
    private static final String DATOS_USUARIOS = "DatosUsuarios" ;
    private static final String SEPARADOR =  ";";

    private ArchivoDeTextoControlador() {
        try {
            File file = new File(DATOS_USUARIOS);

            if(!file.exists()) {
                file.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArchivoDeTextoControlador getInstancia() {
        if(instancia == null) {
            instancia = new ArchivoDeTextoControlador();
        }

        return instancia;
    }

    public void registrarUsuario(String usuario, String contraseña, String nombre, int edad) throws IOException {
        String lineaUsuario = String.join(SEPARADOR, usuario, contraseña, nombre, String.valueOf(edad));
        Files.writeString(Paths.get(DATOS_USUARIOS), lineaUsuario + "\n", StandardOpenOption.APPEND);
    }

    public boolean usuarioExiste(String usuario) {
        try {
            List<String> content = Files.readAllLines(Paths.get(DATOS_USUARIOS));

            for (String entradaUsuario: content) {
                String a = entradaUsuario.split(SEPARADOR)[0];
                if(a.equals(usuario)) {
                    return true;
                }
            }
            return false;
        }catch (IOException ioException) {
            return true;
        }

    }

    public void editarUsuario(Usuario usuario) {

    }

    public boolean validarUsuario(String usuario, String contraseña) {
        return false;
    }
}
