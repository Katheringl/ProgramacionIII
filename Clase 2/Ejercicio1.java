public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OperacionesConArreglos op = new OperacionesConArreglos();

        System.out.println(op.mostrarElementos(a));

        System.out.println("Suma del arreglo: " + op.sumarElementos(a));

        System.out.println("Promedio del arreglo: " + op.promedioElementos(a));
    }
}
