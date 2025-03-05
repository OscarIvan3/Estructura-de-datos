public class SecondPartialMain {
//InsertionSort
    public static void main(String[] args) {
        int[]arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int comparationInsertion = InsertionSort.insertionSort(arr);
        System.out.println("Número total de comparaciones: " + comparationInsertion);

        int[]arrayBubble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int comparationsBubble = BubbleSortCounter.bubbleSort(arrayBubble);
        System.out.println("Número total de comparaciones: " + comparationsBubble);


        int[]arraySelection = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int ComparationsSelection = SelectionSort.selectionSort(arraySelection);
        System.out.println("Número total de comparaciones: " + ComparationsSelection);

    }
}