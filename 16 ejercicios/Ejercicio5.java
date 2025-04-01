import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el número de productos
        System.out.print("Ingrese el número de productos (N): ");
        int N = scanner.nextInt();
        
        // Crear los arreglos
        double[] preciosUnitarios = new double[N];
        int[] cantidadesCompradas = new int[N];
        String[] descripciones = new String[N];
        double[] totalGastado = new double[N];
        
        // Leer los datos de los productos
        scanner.nextLine(); // Limpiar buffer
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la descripción del producto " + (i + 1) + ": ");
            descripciones[i] = scanner.nextLine();
            
            System.out.print("Ingrese el precio unitario de " + descripciones[i] + ": ");
            preciosUnitarios[i] = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad comprada de " + descripciones[i] + ": ");
            cantidadesCompradas[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            // Calcular total gastado por producto
            totalGastado[i] = preciosUnitarios[i] * cantidadesCompradas[i];
        }
        
        // Calcular el total general y el producto con mayor gasto
        double totalGeneral = 0;
        double mayorGasto = totalGastado[0];
        String productoMayorGasto = descripciones[0];
        
        for (int i = 0; i < N; i++) {
            totalGeneral += totalGastado[i];
            if (totalGastado[i] > mayorGasto) {
                mayorGasto = totalGastado[i];
                productoMayorGasto = descripciones[i];
            }
        }
        
        // Mostrar los resultados
        System.out.println("\nTotal gastado por producto:");
        for (int i = 0; i < N; i++) {
            System.out.println(descripciones[i] + ": " + totalGastado[i]);
        }
        
        System.out.println("\nTotal general de todas las compras: " + totalGeneral);
        System.out.println("El producto con mayor gasto es: " + productoMayorGasto + " con un gasto de: " + mayorGasto);
        
        scanner.close();
    }
}
