import java.util.ArrayList;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Ejemplo de arreglo de entrada
        int[] A = { -1, 2, 0, -3, 4, 0, -5, 6 };

        // Listas para almacenar los elementos negativos, cero y positivos
        ArrayList<Integer> negativos = new ArrayList<>();
        ArrayList<Integer> ceros = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();

        // Iterar sobre el arreglo A y separar los elementos
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                negativos.add(A[i]);
            } else if (A[i] == 0) {
                ceros.add(A[i]);
            } else {
                positivos.add(A[i]);
            }
        }

        // Convertir las listas a arreglos
        int[] negativosArray = new int[negativos.size()];
        int[] cerosArray = new int[ceros.size()];
        int[] positivosArray = new int[positivos.size()];

        for (int i = 0; i < negativos.size(); i++) {
            negativosArray[i] = negativos.get(i);
        }
        for (int i = 0; i < ceros.size(); i++) {
            cerosArray[i] = ceros.get(i);
        }
        for (int i = 0; i < positivos.size(); i++) {
            positivosArray[i] = positivos.get(i);
        }

        // Imprimir los resultados
        System.out.println("Elementos negativos:");
        for (int n : negativosArray) {
            System.out.print(n + " ");
        }

        System.out.println("\nElementos cero:");
        for (int c : cerosArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nElementos positivos:");
        for (int p : positivosArray) {
            System.out.print(p + " ");
        }
    }
}

