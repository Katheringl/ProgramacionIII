import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = scanner.nextInt();
        
        // Crear el arreglo
        int[] numeros = new int[N];
        
        // Leer los números del arreglo
        System.out.println("Ingrese " + N + " números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        // Pedir el número a buscar
        System.out.print("Ingrese el número a buscar en el arreglo: ");
        int numeroBuscar = scanner.nextInt();
        
        // Contar las apariciones del número en el arreglo
        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBuscar) {
                contador++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces en el arreglo.");
        
        scanner.close();
    }
}

