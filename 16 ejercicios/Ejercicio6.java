import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el número de viviendas
        System.out.print("Ingrese el número de viviendas (N): ");
        int N = scanner.nextInt();
        
        // Crear los arreglos
        double[] alquileres = new double[N];
        double[] porcentajesGanancia = new double[N];
        double[] ganancias = new double[N];
        
        // Leer los datos de cada vivienda
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el alquiler mensual de la vivienda " + (i + 1) + ": ");
            alquileres[i] = scanner.nextDouble();
            
            System.out.print("Ingrese el porcentaje de ganancia de la vivienda " + (i + 1) + " (en %): ");
            porcentajesGanancia[i] = scanner.nextDouble();
            
            // Calcular la ganancia por vivienda
            ganancias[i] = (alquileres[i] * porcentajesGanancia[i]) / 100;
        }
        
        // Mostrar los resultados
        System.out.println("\nGanancias por vivienda:");
        for (int i = 0; i < N; i++) {
            System.out.println("Vivienda " + (i + 1) + ": " + ganancias[i]);
        }
        
        scanner.close();
    }
}
