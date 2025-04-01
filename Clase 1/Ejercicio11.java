public class Ejercicio11 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 8, 3, 1, 10, 11 };
        System.out.println(sumaParesImparesArreglo(a));
        System.out.println(sumaExtremosArreglo(a));
    }

    public static String sumaParesImparesArreglo(int[] a) {
        int sumaPares = 0, sumaImpares = 0;
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumaPares += a[i];
            } else {
                sumaImpares += a[i];
            }
        }
        cad = "la suma de los numeros pares =" + sumaPares + " suma de los numeros impares =" + sumaImpares;
        return cad;
    }

    public static String sumaExtremosArreglo(int[] a) {
        String cad = "";
        // verificamos si el arreglo es par
        if (a.length % 2 == 0) {
            // El arreglo es par
            for (int i = 0; i < a.length / 2; i++) {
                cad += (a[i] + a[a.length - 1 - i]) + " ";
            }
        } else {
            // el arreglo es impar
            cad += "Arreglo impar";
        }
        return cad;  // Agregado el return aquí para devolver el valor de cad.
    }
}

