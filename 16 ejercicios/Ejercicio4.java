import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño de los arreglos
        System.out.print("Ingrese el tamaño de los arreglos (N): ");
        int N = scanner.nextInt();
        
        // Crear los arreglos
        int[] edades1 = new int[N];
        int[] edades2 = new int[N];
        
        // Leer las edades del primer arreglo
        System.out.println("Ingrese las edades del primer arreglo:");
        for (int i = 0; i < N; i++) {
            edades1[i] = scanner.nextInt();
        }
        
        // Leer las edades del segundo arreglo
        System.out.println("Ingrese las edades del segundo arreglo:");
        for (int i = 0; i < N; i++) {
            edades2[i] = scanner.nextInt();
        }
        
        // Encontrar el mayor valor en ambos arreglos
        int mayor = edades1[0];
        for (int i = 0; i < N; i++) {
            if (edades1[i] > mayor) {
                mayor = edades1[i];
            }
            if (edades2[i] > mayor) {
                mayor = edades2[i];
            }
        }
        
        // Mostrar el resultado
        System.out.println("La mayor edad registrada es: " + mayor);
        
        scanner.close();
    }
}
