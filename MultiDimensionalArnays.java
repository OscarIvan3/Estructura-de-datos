public class MultiDimensionalArnays {
    public static void main(String[] args) {
        int [][] matrix = { 
            {1,2},//[0][0]=1[[0][1]=2
            {3,4}
        };
        for (int i = 0; i <matrix.length; i++){
            System.out.println("longitud de la fila"+ matrix[i].length);// esto for para ver cuantos elementos hay por fila
            for (int j = 0; j < matrix[i].length; j++){//para imprimir los elementos de cada fila
                System.out.print(matrix[i][j]+ "");

            }
            System.out.println();
        }
    }
}
