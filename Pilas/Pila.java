package Pilas;
import java.util.Stack;

/**
 * Clase que implementa una pila de enteros utilizando la clase Stack de Java.
 */
class Pila {
    private Stack<Integer> stack = new Stack<>();

    /**
     * Inserta un elemento en la pila.
     * @param x Elemento a insertar.
     */
    public void insertar(int x) {
        stack.push(x);
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * @return Elemento eliminado.
     */
    public int quitar() {
        return stack.pop();
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     * @return Elemento en la cima.
     */
    public int cimaPila() {
        return stack.peek();
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean pilaVacia() {
        return stack.isEmpty();
    }
}
