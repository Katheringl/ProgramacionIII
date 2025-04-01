import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir el tamaño del arreglo
        int N = 10;
        int[] A = new int[N];
        
        // Leer los 10 números del arreglo A
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Contar los pares e impares para definir los tamaños de los arreglos
        int countPares = 0, countImpares = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }
        
        // Crear los arreglos de pares e impares con el tamaño exacto
        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];
        
        // Llenar los arreglos de pares e impares
        int indexPares = 0, indexImpares = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            } else {
                impares[indexImpares++] = num;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Números pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nNúmeros impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
