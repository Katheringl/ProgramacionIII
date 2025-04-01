package Colas;
import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
    public static void main(String[] args) {
        // Creamos dos colas de ejemplo
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        // Insertamos elementos en las colas
        cola1.offer(1); cola1.offer(2); cola1.offer(3);
        cola2.offer(1); cola2.offer(2); cola2.offer(3);

        // Comprobamos si son idénticas
        System.out.println("Las colas son idénticas: " + ComparadorColas.sonIdenticas(cola1, cola2)); // Salida: true
    }
}
