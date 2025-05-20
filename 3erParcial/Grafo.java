import java.util.*;

public class Grafo {

    // Lista de adyacencia muy simple
    private Map<String, List<String>> grafo = new HashMap<>();

    // Agregar vértice
    public void agregarVertice(String vertice) {
        grafo.putIfAbsent(vertice, new ArrayList<>());
    }

    // Agregar arista (bidireccional)
    public void agregarArista(String origen, String destino) {
        grafo.get(origen).add(destino);
        grafo.get(destino).add(origen);
    }

    // Mostrar conexiones
    public void mostrarGrafo() {
        for (String vertice : grafo.keySet()) {
            System.out.println(vertice + " está conectado con: " + grafo.get(vertice));
        }
    }
}