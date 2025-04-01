package Colas;
import java.util.LinkedList;
import java.util.Queue;

public class ComparadorColas {

    // Método que compara dos colas y devuelve true si son idénticas
    public static <T> boolean sonIdenticas(Queue<T> cola1, Queue<T> cola2) {
        // Verificamos si las colas tienen el mismo tamaño
        if (cola1.size() != cola2.size()) {
            return false;
        }

        // Creamos copias de las colas para no modificar las originales
        Queue<T> copiaCola1 = new LinkedList<>(cola1);
        Queue<T> copiaCola2 = new LinkedList<>(cola2);

        // Comparamos los elementos de las colas
        while (!copiaCola1.isEmpty()) {
            if (!copiaCola1.poll().equals(copiaCola2.poll())) {
                return false; // Si hay diferencia, las colas no son idénticas
            }
        }
        return true; // Si no encontramos diferencias, las colas son idénticas
    }
}

