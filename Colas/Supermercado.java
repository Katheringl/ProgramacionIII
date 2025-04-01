package Colas;
import java.util.LinkedList;
import java.util.Queue;

public class Supermercado {

    // Cola que representa los carritos de compra disponibles
    private Queue<Integer> carritosDisponibles;

    // Colas que representan las cajas de pago (3 cajas)
    private Queue<Integer>[] cajas;

    public Supermercado() {
        // Inicializamos los carritos disponibles (25 carritos)
        carritosDisponibles = new LinkedList<>();
        for (int i = 1; i <= 25; i++) {
            carritosDisponibles.offer(i);
        }

        // Inicializamos las 3 cajas (se usan colas para las cajas)
        cajas = new Queue[3];
        for (int i = 0; i < 3; i++) {
            cajas[i] = new LinkedList<>();
        }
    }

    // Método para que un cliente llegue al supermercado
    public void llegaCliente(int clienteId) {
        if (!carritosDisponibles.isEmpty()) {
            // Si hay un carrito disponible, el cliente lo toma
            int carrito = carritosDisponibles.poll();
            System.out.println("Cliente " + clienteId + " ha tomado el carrito " + carrito + " y está comprando.");
            
            // El cliente se coloca en la caja con menos clientes
            int cajaElegida = elegirCaja();
            cajas[cajaElegida].offer(clienteId); // El cliente se coloca en la cola de la caja elegida
            System.out.println("Cliente " + clienteId + " se ha colocado en la caja " + (cajaElegida + 1));
        } else {
            // Si no hay carritos disponibles, el cliente espera
            System.out.println("Cliente " + clienteId + " espera por un carrito.");
        }
    }

    // Método para elegir la caja con menos clientes
    private int elegirCaja() {
        int cajaConMenosClientes = 0;
        int numClientesEnCaja = cajas[0].size();
        
        for (int i = 1; i < 3; i++) {
            if (cajas[i].size() < numClientesEnCaja) {
                cajaConMenosClientes = i;
                numClientesEnCaja = cajas[i].size();
            }
        }
        return cajaConMenosClientes;
    }

    // Método para procesar el pago de un cliente
    public void procesaPago() {
        // Buscamos la caja que tenga clientes
        for (int i = 0; i < 3; i++) {
            if (!cajas[i].isEmpty()) {
                int clienteId = cajas[i].poll(); // El cliente paga y sale de la cola
                System.out.println("Cliente " + clienteId + " ha pagado en la caja " + (i + 1));
                
                // El carrito usado por el cliente se devuelve a la cola de carritos
                carritosDisponibles.offer(clienteId);
                System.out.println("Carrito " + clienteId + " queda disponible.");
                break; // Procesamos un solo cliente
            }
        }
    }
}
