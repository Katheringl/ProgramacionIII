package Pilas;

import java.util.Stack;

/**
 * Clase principal que prueba los ejercicios de la pila.
 */
public class Main {
    public static void main(String[] args) {
        // Ejercicio 9.1 - Prueba del código dado
        System.out.println("Ejercicio 9.1 - Salida esperada:");
        Pila p = new Pila();
        int x = 4, y;
        p.insertar(x);
        System.out.println("\n " + p.cimaPila()); // Muestra el valor en la cima (4)
        y = p.quitar();
        p.insertar(32);
        p.insertar(p.quitar());
        do {
            System.out.println("\n " + p.quitar());
        } while (!p.pilaVacia());

        // Ejercicio 9.2 - Mostrar elementos de una pila de cadenas
        System.out.println("\nEjercicio 9.2 - Mostrar pila de cadenas:");
        Stack<String> pilaCadenas = new Stack<>();
        pilaCadenas.push("Hola");
        pilaCadenas.push("Mundo");
        pilaCadenas.push("Java");
        mostrarPila(pilaCadenas);

        // Ejercicio 9.3 - Convertir expresión infija a postfija
        System.out.println("\nEjercicio 9.3 - Expresión en notación postfija:");
        String expresion = "(x-y)/(z+w)-(z+y)^x";
        System.out.println("Expresión original: " + expresion);
        System.out.println("Expresión en postfija: " + ConversionExpresion.infijaAPostfija(expresion));

        // Ejercicio 9.4 - Guardar 10 números en un array y pasarlos a una pila
        System.out.println("\nEjercicio 9.4 - Almacenar números en pila:");
        double[] numeros = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0 };
        Stack<Double> pilaNumeros = new Stack<>();

        System.out.println("Secuencia original:");
        for (double num : numeros) {
            System.out.print(num + " ");
            pilaNumeros.push(num);
        }

        System.out.println("\nPila extraída:");
        while (!pilaNumeros.isEmpty()) {
            System.out.print(pilaNumeros.pop() + " ");
        }
    }

    /**
     * Muestra los elementos de una pila de cadenas sin perder su contenido.
     * 
     * @param pila Pila de cadenas a mostrar.
     */
    public static void mostrarPila(Stack<String> pila) {
        Stack<String> auxiliar = new Stack<>();
        while (!pila.isEmpty()) {
            String elemento = pila.pop();
            System.out.println(elemento);
            auxiliar.push(elemento);
        }
        while (!auxiliar.isEmpty()) { // Restaurar la pila original
            pila.push(auxiliar.pop());
        }
    }
}
