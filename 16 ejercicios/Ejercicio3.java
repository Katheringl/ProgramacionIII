import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo (N): ");
        int N = scanner.nextInt();
        
        // Crear el arreglo
        int[] numeros = new int[N];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        // Leer los N números y calcular la suma de pares e impares
        System.out.println("Ingrese los " + N + " números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }
        
        // Mostrar los resultados
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
        
        scanner.close();
    }
}
