import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int N = scanner.nextInt();
        
        // Crear el arreglo A
        int[] A = new int[N];
        
        // Leer los elementos del arreglo A
        System.out.println("Ingrese " + N + " números:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Determinar el tamaño del nuevo arreglo B
        int sizeB = (N + 1) / 2;
        int[] B = new int[sizeB];
        
        // Llenar el arreglo B con la suma de elementos opuestos
        for (int i = 0; i < sizeB; i++) {
            B[i] = A[i] + A[N - 1 - i];
        }
        
        // Mostrar el arreglo resultante B
        System.out.println("Arreglo resultante B:");
        for (int num : B) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
