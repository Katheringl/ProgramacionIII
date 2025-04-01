public class Ejercicio14 {
    public static void main(String[] args) {
        // Ejemplo de arreglo de entrada
        int[] A = { 4, 6, 8, 2, 6, 9, 5, 1 };

        // Crear el arreglo resultante B
        int[] B = new int[A.length - 1];

        // Calcular la diferencia de los elementos sucesivos
        for (int i = 0; i < A.length - 1; i++) {
            B[i] = A[i + 1] - A[i];
        }

        // Imprimir el arreglo resultante B
        System.out.println("Arreglo resultante B:");
        for (int b : B) {
            System.out.print(b + " ");
        }
    }
}
