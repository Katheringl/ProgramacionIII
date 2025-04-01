import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int N = scanner.nextInt();
        
        // Crear el arreglo
        int[] numeros = new int[N];
        int suma = 0;
        
        // Leer los N números y calcular la suma
        System.out.println("Ingrese los " + N + " números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        
        // Mostrar el resultado
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}

