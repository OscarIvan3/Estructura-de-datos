public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Crear una instancia de la clase
        MultiDimensionalArrays arrays = new MultiDimensionalArrays();
        // Llamar al método printbidimensionalArray
        arrays.printbidimensionalArray();
    }
    
    public void printbidimensionalArray() {
        int[][] matrix = { 
            {1, 2},   // [0][0] = 1, [0][1] = 2
            {3, 4}    // [1][0] = 3, [1][1] = 4
        };
        
        // Recorrer la matriz y mostrar los elementos
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Longitud de la fila " + matrix[i].length); // Longitud de cada fila
            for (int j = 0; j < matrix[i].length; j++) {  // Imprimir los elementos de cada fila
                System.out.print(matrix[i][j] + " ");  // Añadido un espacio para una mejor presentación
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }
}
