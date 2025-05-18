import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
   
        Queue<String> cola = new LinkedList<>();

        public void insertarElemento(String valor) {
            cola.add(valor);
        }
        public void quienSigue() {
            cola.peek();
            System.out.println("El siguiente cliente es: " + cola.peek());
        }
        public void atendiendo(){
            System.out.println("Atendiendo a: " + cola.poll());
        }
        public void atendiendosig(){
            System.out.println("Atendiendo a Siguiente: " + cola.poll());
        }
        public void quienfrente(){
            System.out.println("Cliente al frente ahora: " + cola.peek());
        }

    
    }
 