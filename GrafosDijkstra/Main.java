package GrafosDijkstra;

import java.util.Map;

/**
 * Programa principal para probar el algoritmo de Dijkstra.
 * Este programa crea un grafo con nodos y aristas, y calcula
 * las distancias mínimas desde un nodo inicial a todos los demás nodos
 * usando el algoritmo de Dijkstra.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia del grafo
        Graph graph = new Graph();

        // Construcción del grafo agregando aristas entre nodos con sus respectivos costos
        // addEdge(origen, destino, costo)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);

        int startNode = 0; // Nodo inicial desde donde se calcularán las distancias mínimas

        // Ejecutar el algoritmo de Dijkstra para encontrar las distancias mínimas
        Map<Integer, Integer> distances = graph.dijkstra(startNode);

        // Imprimir las distancias mínimas desde el nodo inicial a cada nodo del grafo
        System.out.println("Distancias mínimas desde el nodo " + startNode + ":");
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("Hasta nodo " + entry.getKey() + " = " + entry.getValue());
        }
    }
}

