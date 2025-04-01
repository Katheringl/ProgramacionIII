import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir el tamaño del arreglo
        int N = 30;
        int[] numeros = new int[N];
        
        // Leer los 30 números
        System.out.println("Ingrese 30 números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        // Inicializar variables
        int mayor = numeros[0], menor = numeros[0];
        int countMayor = 0, countMenor = 0;
        
        // Encontrar mayor, menor y sus repeticiones
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
                countMayor = 1;
            } else if (num == mayor) {
                countMayor++;
            }
            
            if (num < menor) {
                menor = num;
                countMenor = 1;
            } else if (num == menor) {
                countMenor++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("El número mayor es: " + mayor + " y se repite " + countMayor + " veces.");
        System.out.println("El número menor es: " + menor + " y se repite " + countMenor + " veces.");
        
        scanner.close();
    }
}

