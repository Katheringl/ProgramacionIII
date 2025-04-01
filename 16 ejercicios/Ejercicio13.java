import java.util.ArrayList;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Ejemplo de arreglo de entrada
        int[] A = { 4, 6, 8, 2, 6, 9, 5, 7 };

        // Calcular la media del arreglo
        double suma = 0;
        for (int i = 0; i < A.length; i++) {
            suma += A[i];
        }
        double media = suma / A.length;

        // Listas para almacenar los elementos mayores y menores que la media
        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();

        // Separar los elementos según si son mayores o menores que la media
        for (int i = 0; i < A.length; i++) {
            if (A[i] > media) {
                mayores.add(A[i]);
            } else if (A[i] < media) {
                menores.add(A[i]);
            }
        }

        // Convertir las listas a arreglos
        int[] mayoresArray = new int[mayores.size()];
        int[] menoresArray = new int[menores.size()];

        for (int i = 0; i < mayores.size(); i++) {
            mayoresArray[i] = mayores.get(i);
        }
        for (int i = 0; i < menores.size(); i++) {
            menoresArray[i] = menores.get(i);
        }

        // Imprimir los resultados
        System.out.println("Elementos mayores que la media:");
        for (int m : mayoresArray) {
            System.out.print(m + " ");
        }

        System.out.println("\nElementos menores que la media:");
        for (int n : menoresArray) {
            System.out.print(n + " ");
        }
    }
}
