import java.util.Stack;

public class EjemploPila {
    public Stack<String> pila = new Stack<>(); //Corregido con ayuda de AI

    public void valorPila(String valor) {
        // Puedes usar la pila que ya declaraste:
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");

        System.out.println("Elemento en la cima: " + pila.peek());

        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elemento removido: " + pila.pop());

        System.out.println("Elemento en la cima ahora: " + pila.peek());
    }
}
