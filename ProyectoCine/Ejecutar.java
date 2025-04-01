//Realizado por Katerine Galeano Lopez

package ProyectoCine;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine(); // Se crea un objeto Cine donde se gestionarán las películas y salas
        boolean running = true;

        // Bucle que mantiene el programa corriendo hasta que el usuario decida salir
        while (running) {
            System.out
                    .println("1. Agregar Película\n2. Asignar Función\n3. Ver Funciones\n4. Comprar Boleta\n5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Idioma: ");
                    String idioma = scanner.nextLine();
                    System.out.print("Tipo (35mm/3D): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Duración (minutos): ");
                    int duracion = scanner.nextInt();
                    cine.agregarPelicula(new Pelicula(nombre, idioma, tipo, duracion));
                    break;
                case 2:
                    System.out.print("Número de Sala (1-3): ");
                    int salaNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Horario (0-2): ");
                    int horario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre de la Película: ");
                    String peliNombre = scanner.nextLine();
                    Pelicula pelicula = cine.buscarPelicula(peliNombre);
                    if (pelicula != null) {
                        cine.obtenerSala(salaNum).asignarPelicula(pelicula, horario);
                    } else {
                        System.out.println("Película no encontrada");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 3; i++) {
                        cine.obtenerSala(i).mostrarFunciones();
                    }
                    break;
                case 4:
                    System.out.print("Número de Sala (1-3): ");
                    int salaCompra = scanner.nextInt();
                    scanner.nextLine();
                    Sala sala = cine.obtenerSala(salaCompra);
                    sala.mostrarAsientos();
                    System.out.print("Fila (A-H): ");
                    char fila = scanner.next().charAt(0);
                    int filaNum = fila - 'A';

                    int maxAsientos = (filaNum >= 6) ? 9 : 12;

                    System.out.print("Número de asiento (1-" + maxAsientos + "): ");
                    int asiento = scanner.nextInt();

                    if (asiento < 1 || asiento > maxAsientos) {
                        System.out.println("Asiento fuera de rango.");
                    } else if (sala.venderBoleta(filaNum, asiento - 1)) {
                        int precio = sala.calcularPrecio(filaNum);
                        System.out.println("Boleta comprada con éxito. Total a pagar: $" + precio);
                    } else {
                        System.out.println("Asiento no disponible");
                    }

                    break;
                case 5:
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}
