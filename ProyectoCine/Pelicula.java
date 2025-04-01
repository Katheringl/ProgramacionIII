package ProyectoCine;

public class Pelicula {
    String nombre;
    String idioma;
    String tipo;
    int duracion;

    public Pelicula(String nombre, String idioma, String tipo, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    // Método para obtener el nombre de la película
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el tipo de la película (35mm, 3D)
    public String getTipo() {
        return tipo;
    }
}
