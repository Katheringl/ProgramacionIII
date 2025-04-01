import java.util.Stack;
 
public class EjecutarPila {
   
    public static void main(String[] args) {
 
        // Creación de la estructura Stack (Pila)
        Stack<String> nombres = new Stack<>();
       
        System.out.println(nombres.empty());  // Verifica si la pila está vacía
       
        // Insertar elementos en la pila
        nombres.push("pedro");
        nombres.push("juan");
        nombres.push("maria");
        nombres.push("camila");
        nombres.push("daniel");
 
        // Imprimir la pila
        System.out.println(nombres);
 
        // Mostrar quién está en el tope de la pila sin removerlo
        System.out.println(nombres.peek());  // daniel
        // buscar elemento dentro de la fila
        System.out.println(nombres.search("camila")); // 2
 
        //retirar un elemento de la pila
        System.out.println(nombres.pop());
 
        // imprimir la fila
        System.out.println(nombres);
 
    }
}
 