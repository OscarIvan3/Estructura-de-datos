
public class SelectionSort {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Cuenta solo comparaciones
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
            // Imprimir el estado del arreglo en cada iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return comparisons;
    }
    
    public static void main(String args[]) {
        int worstCase[] = {5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int bestCase[] = {1, 2, 3, 4, 5};  // Mejor caso (ordenado)

        System.out.println("Peor Caso:");
        int worstComparisons = selectionSort(worstCase);
        System.out.println("\nTotal de comparaciones: " + worstComparisons);

        System.out.println("\nMejor Caso:");
        int bestComparisons = selectionSort(bestCase);
        System.out.println("\nTotal de comparaciones: " + bestComparisons);
    }
}