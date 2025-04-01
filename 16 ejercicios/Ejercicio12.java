import java.util.ArrayList;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Ejemplo de arreglo de entrada y el valor a buscar
        int[] A = { 4, 6, 8, 2, 6, 9, 6, 1 };
        int x = 6;

        // Lista para almacenar las posiciones de los elementos que son iguales a x
        ArrayList<Integer> posiciones = new ArrayList<>();

        // Recorrer el arreglo A para encontrar las posiciones de los elementos que son iguales a x
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                posiciones.add(i);  // Almacena la posición
            }
        }

        // Convertir la lista de posiciones a un arreglo
        int[] B = new int[posiciones.size()];
        for (int i = 0; i < posiciones.size(); i++) {
            B[i] = posiciones.get(i);
        }

        // Imprimir el arreglo resultante
        System.out.println("Arreglo resultante B:");
        for (int b : B) {
            System.out.print(b + " ");
        }
    }
}

