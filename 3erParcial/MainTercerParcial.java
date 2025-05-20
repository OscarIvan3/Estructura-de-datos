public class MainTercerParcial {
    public static void main(String[] args ) {
        

        
        EjemploCola ejemploCola = new EjemploCola();
        ejemploCola.insertarElemento("Jorge");
        ejemploCola.insertarElemento("Luis");
        ejemploCola.insertarElemento("Pedro");


        ejemploCola.quienSigue();
        ejemploCola.atendiendo();
        ejemploCola.atendiendosig();
        ejemploCola.quienfrente();



        EjemploPila ejemploPila = new EjemploPila();
        ejemploPila.pila.push ("Plato 1 ");
        ejemploPila.pila.push("Plato 2");
        ejemploPila.pila.push("Plato 4");


        ejemploPila.valorPila(null);
        
   
        ListaCircular lista = new ListaCircular();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        lista.mostrar();

    
        SinglyLinkedList listaSimple = new SinglyLinkedList();
        listaSimple.insert(10);
        listaSimple.insert(20);
        listaSimple.insert(30);
        listaSimple.insert(40);
        listaSimple.insert(50);

        System.out.println("Lista enlazada simple:");
        listaSimple.display();

        System.out.println("¿Está el 20 en la lista? " + listaSimple.search(20));

        listaSimple.delete(30);
        System.out.println("Después de eliminar el 30:");
        listaSimple.display();


        ListaCircular listaaCircular = new ListaCircular();
        listaaCircular.agregar(1);
        listaaCircular.agregar(2);
        listaaCircular.agregar(3);
        listaaCircular.agregar(4);

        lista.mostrar();



        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(0)); // true
    }
}




    
    

