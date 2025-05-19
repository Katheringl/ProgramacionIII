package GrafosDijkstra;

/**
 * Representa una arista o ruta dirigida entre dos nodos en el grafo.
 * Contiene información sobre el nodo destino y el peso o costo de la arista.
 */
public class Edge {
    private int destination; // Nodo destino de la arista
    private int weight;      // Peso o costo asociado a la arista

    /**
     * Constructor para crear una arista con nodo destino y peso.
     * 
     * @param destination Nodo destino de la arista.
     * @param weight Peso o costo de la arista.
     */
    public Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * Obtiene el nodo destino de la arista.
     * 
     * @return Nodo destino.
     */
    public int getDestination() {
        return destination;
    }

    /**
     * Obtiene el peso o costo de la arista.
     * 
     * @return Peso o costo.
     */
    public int getWeight() {
        return weight;
    }
}

