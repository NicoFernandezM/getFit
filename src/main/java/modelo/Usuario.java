package modelo;

public class Usuario {
    private String usuario;
    private String nombre;
    private int edad;
    private int maxRepsFlexiones;
    private int maxRepsDominadas;

    public Usuario(String usuario, String nombre, int edad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getMaxRepsFlexiones() {
        return this.maxRepsFlexiones;
    }

    public int getMaxRepsDominadas() {
        return this.maxRepsDominadas;
    }

}
