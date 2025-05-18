public class ListaCircular {

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    Nodo cabeza = null;
    Nodo cola = null;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        if (cabeza != null) {
            do {
                System.out.print(actual.dato + " -> ");
                actual = actual.siguiente;
            } while (actual != cabeza);
            System.out.println("(regresa al inicio)");
        }
    }
}
