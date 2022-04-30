package registro;

public class usuarioLogic {

    private static usuarioLista usuarioLista= new usuarioLista();

    public static boolean autentificar(String usuario, String contraseña) {
        if (obtener(usuario) != null) {
            usuario usuarioconsulta=obtener(usuario);
            if(usuarioconsulta.getUsuario().equals(usuario) && usuarioconsulta.getContraseña().equals(contraseña)){
                return true;
            }else
                return false;
        } else {
            return false;
        }
    }

    public static boolean insertar(usuario usuario) {
        return usuarioLista.insertar(usuario);
    }

    public static boolean modificar(usuario usuario){
        return usuarioLista.modificar(usuario);
    }

    public static boolean eliminar(String usuario){
        return usuarioLista.eliminar(usuario);
    }

    public static usuario obtener(String usuario){
        return usuarioLista.obtener(usuario);
    }
}
