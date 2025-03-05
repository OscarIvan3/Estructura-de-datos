public class BubbleSortCounter {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int comparisons = bubbleSort(arr);
        System.out.println("Número total de comparaciones: " + comparisons);
    }

    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++; // Contar comparaciones
                if (arr[j] > arr[j + 1]) {
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Si no hubo intercambios, ya está ordenado
        }
        return comparisons;
    }
}