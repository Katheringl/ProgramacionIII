package Pilas;

import java.util.Stack;

/**
 * Clase para convertir expresiones matemáticas de notación infija a postfija.
 */
class ConversionExpresion {

    /**
     * Convierte una expresión en notación infija a su equivalente en notación
     * postfija.
     * 
     * @param expresion Expresión en notación infija.
     * @return Expresión en notación postfija.
     */
    public static String infijaAPostfija(String expresion) {
        Stack<Character> pila = new Stack<>();
        StringBuilder postfija = new StringBuilder();

        for (char c : expresion.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Si es operando (letra o número)
                postfija.append(c).append(" ");
            } else if (c == '(') { // Si es paréntesis de apertura
                pila.push(c);
            } else if (c == ')') { // Si es paréntesis de cierre
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop()).append(" ");
                }
                pila.pop(); // Elimina el '(' de la pila
            } else { // Si es operador
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(c)) {
                    postfija.append(pila.pop()).append(" ");
                }
                pila.push(c);
            }
        }

        while (!pila.isEmpty()) { // Extrae los operadores restantes
            postfija.append(pila.pop()).append(" ");
        }

        return postfija.toString();
    }

    /**
     * Determina la prioridad de un operador.
     * 
     * @param operador Operador matemático.
     * @return Nivel de prioridad (mayor valor significa mayor prioridad).
     */
    public static int prioridad(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
