package Colas;
public class Main2 {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        
        // Simulamos la llegada de algunos clientes
        supermercado.llegaCliente(101); // Cliente 101 llega
        supermercado.llegaCliente(102); // Cliente 102 llega
        supermercado.llegaCliente(103); // Cliente 103 llega
        
        // Simulamos el pago de un cliente
        supermercado.procesaPago(); // Un cliente paga
        supermercado.procesaPago(); // Otro cliente paga
        supermercado.llegaCliente(104); // Cliente 104 llega después de que alguien paga
    }
}
