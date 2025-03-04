public class SecondPartialMain {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] insertionSortArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Peor Caso:");
        int operacionesPeor = insertionSort.sort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
    }
}
