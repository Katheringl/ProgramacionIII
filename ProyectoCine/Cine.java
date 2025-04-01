package ProyectoCine;

import java.util.ArrayList;

class Cine {
    private ArrayList<Pelicula> peliculas;
    private Sala[] salas;

    public Cine() {
        peliculas = new ArrayList<>();
        salas = new Sala[] { new Sala(1, false), new Sala(2, false), new Sala(3, true) };
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Método para buscar una película por su nombre
    public Pelicula buscarPelicula(String nombre) {
        for (Pelicula p : peliculas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    // Método para obtener una sala por su número
    public Sala obtenerSala(int numero) {
        if (numero >= 1 && numero <= 3) {
            return salas[numero - 1];
        }
        return null;
    }
}
