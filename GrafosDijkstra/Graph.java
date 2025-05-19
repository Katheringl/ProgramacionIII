package GrafosDijkstra;

import java.util.*;

/**
 * Representa un grafo dirigido con pesos usando una lista de adyacencia.
 * Cada nodo está asociado a una lista de aristas (edges) que apuntan a sus vecinos.
 * Implementa el algoritmo de Dijkstra para encontrar las distancias mínimas
 * desde un nodo inicial a todos los demás nodos del grafo.
 */
public class Graph {
    // Mapa que asocia cada nodo a una lista de aristas (vecinos y pesos)
    private Map<Integer, List<Edge>> adjacencyList = new HashMap<>();

    /**
     * Agrega una arista dirigida desde 'source' hasta 'destination' con un peso dado.
     * 
     * @param source Nodo origen de la arista.
     * @param destination Nodo destino de la arista.
     * @param weight Peso o costo de la arista.
     */
    public void addEdge(int source, int destination, int weight) {
        // Si el nodo source no existe en el mapa, se agrega con una lista vacía
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        // Se añade la arista (destino y peso) a la lista del nodo source
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    /**
     * Ejecuta el algoritmo de Dijkstra para calcular las distancias mínimas
     * desde el nodo 'start' a todos los demás nodos alcanzables en el grafo.
     * 
     * @param start Nodo desde donde se calculan las distancias mínimas.
     * @return Un mapa que asocia cada nodo con la distancia mínima desde 'start'.
     */
    public Map<Integer, Integer> dijkstra(int start) {
        // Mapa para guardar las distancias mínimas estimadas a cada nodo
        Map<Integer, Integer> distances = new HashMap<>();

        // Inicializar todas las distancias a infinito (valor máximo)
        for (Integer node : adjacencyList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        // La distancia al nodo inicial es cero
        distances.put(start, 0);

        // Cola de prioridad que ordena por la distancia mínima para procesar primero el nodo más cercano
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        // Agregar el nodo inicial con distancia 0
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            // Extraer el nodo con la distancia mínima estimada
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            // Si la distancia obtenida es mayor que la ya guardada, se ignora (ya se encontró un camino mejor)
            if (currentDist > distances.get(currentNode)) {
                continue;
            }

            // Recorrer todas las aristas (vecinos) del nodo actual
            for (Edge edge : adjacencyList.getOrDefault(currentNode, Collections.emptyList())) {
                int newDist = currentDist + edge.getWeight();

                // Si se encontró un camino más corto al nodo vecino, actualizar la distancia
                if (newDist < distances.getOrDefault(edge.getDestination(), Integer.MAX_VALUE)) {
                    distances.put(edge.getDestination(), newDist);
                    // Añadir el vecino a la cola de prioridad con la nueva distancia
                    pq.add(new int[]{edge.getDestination(), newDist});
                }
            }
        }

        return distances;
    }
}
