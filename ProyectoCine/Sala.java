package ProyectoCine;

class Sala {
    private int numero;
    private boolean es3D;
    private String[][] asientos;
    private String[] funciones;
    private String[] horarios = { "14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00" };

    public Sala(int numero, boolean es3D) {
        this.numero = numero;
        this.es3D = es3D;
        this.asientos = new String[numero == 3 ? 6 : 8][];
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new String[i < 6 ? 12 : 9];
        }
        this.funciones = new String[3];
        inicializarAsientos();
    }

    public boolean es3D() {
        return es3D;
    }

    public void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = "O";
            }
        }
    }
    public void mostrarAsientos() {
        System.out.println("Asientos disponibles en sala " + numero + ":");
        for (int i = 0; i < asientos.length; i++) {
        
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < asientos[i].length; j++) { 
                
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean venderBoleta(int fila, int columna) {
        if (fila < 0 || fila >= asientos.length || columna < 0 || columna >= asientos[fila].length
                || asientos[fila][columna].equals("X")) {
            return false; 
        }
        asientos[fila][columna] = "X";
        return true;
    }

    public int calcularPrecio(int fila) {
        if (numero == 3) {
            return 12000;
        } else if (fila >= 6) {
            return 15000;
        }
        return 11000;
    }

    public void asignarPelicula(Pelicula pelicula, int horario) {
        if (es3D && !pelicula.getTipo().equals("3D")) {
            System.out.println("La sala 3 solo acepta películas 3D");
            return;
        }
        if (!es3D && pelicula.getTipo().equals("3D")) {
            System.out.println("Las salas 1 y 2 no aceptan peliculas en formato 3D");
            return;
        }
        if (funciones[horario] != null) {
            System.out.println("Ya hay una película asignada en este horario.");
            return;
        }
        funciones[horario] = pelicula.getNombre();
        System.out.println("Película '" + pelicula.getNombre() + "' ha sido asignada a la sala " + numero
                + " en el horario " + horarios[horario]);
    }

    public void mostrarFunciones() {
        System.out.println("Funciones de la sala " + numero);
        for (int i = 0; i < funciones.length; i++) {
            System.out.println(horarios[i] + ": " + (funciones[i] != null ? funciones[i] : "No hay película asignada"));
        }
    }
}
