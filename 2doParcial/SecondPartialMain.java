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
        
        class IndexSearch {
            public void search() {
                int[] datos = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
                int target = 50; // Número a buscar
                int index = -1; // Índice inicializado como no encontrado
        
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] == target) {
                        index = i;
                        break;
                    }
                }
        
                if (index != -1) {
                    System.out.println("El número " + target + " se encuentra en el índice: " + index);
                } else {
                    System.out.println("El número " + target + " no se encuentra en el arreglo.");
                }
            }
        }
    MergeSort objMergeSort = new MergeSort();
    int[] array = {38, 27, 43, 10}; // Arreglo a ordenar
    
    int left = 0;
    int right = array.length - 1;
    objMergeSort.mergeSort(array,left,right);
    
    


