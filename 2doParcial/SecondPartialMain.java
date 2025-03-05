public class SecondPartialMain {


    //InsertionSort
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso:
        
        System.out.println("Arreglo original:");
        printArray(array);
        
        // Prueba del algoritmo de Inserción con conteo de comparaciones
        int[] insertionArray = array.clone();
        int comparisons = InsertionSort.sort(insertionArray);
        System.out.println("Ordenado por Inserción:");
        printArray(insertionArray); 
        System.out.println("Número total de comparaciones: " + comparisons);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}