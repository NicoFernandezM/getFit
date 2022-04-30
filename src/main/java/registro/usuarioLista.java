package registro;

import java.util.ArrayList;
import java.util.List;

public class usuarioLista {
    private List<usuario> usuarios;

    public usuarioLista(){
        usuarios=new ArrayList<>();
    }

    public int buscar(String usuario){
        int buscador=-1;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getUsuario().equals(usuario)){
                buscador=i;
                break;
            }
        }
        return buscador;
    }

    public boolean insertar(usuario usuario){
        if(buscar(usuario.getUsuario())==-1) {
            usuarios.add(usuario);
            return true;
        }
        return false;
    }

    public boolean modificar(usuario usuario){
        if(buscar(usuario.getUsuario())!=-1) {
            usuario usuarioaux=obtener(usuario.getUsuario());

            usuarioaux.setUsuario(usuario.getUsuario());
            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setNombres(usuario.getNombres());
            usuarioaux.setApellidos(usuario.getApellidos());
            usuarioaux.setCorreo(usuario.getCorreo());

            return true;
        }
        return false;
    }

    public boolean eliminar(String usuario){
        if(buscar(usuario)!=-1) {
            usuarios.remove(buscar(usuario));
            return true;
        }
        return false;

    }

    public usuario obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }

}
