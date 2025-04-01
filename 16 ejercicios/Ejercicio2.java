import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el número de empleados
        System.out.print("Ingrese el número de empleados (N): ");
        int N = scanner.nextInt();
        
        // Crear los arreglos
        int[] sueldos = new int[N];
        int[] asignaciones = new int[N];
        int[] deducciones = new int[N];
        int[] netoAPagar = new int[N];
        
        // Leer los sueldos
        System.out.println("Ingrese los sueldos de los empleados:");
        for (int i = 0; i < N; i++) {
            sueldos[i] = scanner.nextInt();
        }
        
        // Leer las asignaciones
        System.out.println("Ingrese las asignaciones de los empleados:");
        for (int i = 0; i < N; i++) {
            asignaciones[i] = scanner.nextInt();
        }
        
        // Leer las deducciones
        System.out.println("Ingrese las deducciones de los empleados:");
        for (int i = 0; i < N; i++) {
            deducciones[i] = scanner.nextInt();
        }
        
        // Calcular el neto a pagar
        for (int i = 0; i < N; i++) {
            netoAPagar[i] = sueldos[i] + asignaciones[i] - deducciones[i];
        }
        
        // Mostrar los resultados
        System.out.println("Neto a pagar a cada empleado:");
        for (int i = 0; i < N; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + netoAPagar[i]);
        }
        
        scanner.close();
    }
}
