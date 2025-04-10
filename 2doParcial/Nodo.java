class Nodo {
    int dato;
    Nodo siguiente;
  
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
  
class ListaCircularSimple {
    Nodo inicio;
  
    public ListaCircularSimple() {
        inicio = null;
    }
  
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            inicio.siguiente = inicio;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != inicio) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = inicio;
        }
    }
  
    public void mostrar() {
        if (inicio != null) {
            Nodo actual = inicio;
            do {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            } while (actual != inicio);
            System.out.println();
        } else {
            System.out.println("La lista esta vacia.");
        }
    }
}
  
public class Main {
    public static void main(String[] args) {
        ListaCircularSimple lista = new ListaCircularSimple();
  
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
  
        System.out.println("Lista circular:");
        lista.mostrar();
    }
}