package PrimerParcial;
//Oscar Aragon
//14715
//Par o impar

public class NumberType {
    public static void main(String[] args) {
        NumberType numberType = new NumberType();
        numberType.numeros();
    }
    
    public void numeros() {
        int[][] num = {
            { 0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
              29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
              59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
              89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
              18, 21, 24, 27, 30, 33, 36, 39, 42, 45}
        };

        int par = 0;
        int impar = 0;
        int ceros = 0;

        //contar si son pares o no 
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == 0) {
                    par++;
                } else if (num[i][j] % 2 == 0) {
                    impar++;
                } else {
                    ceros++;
                }
            }
        }

        // los resultados
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números nones: " + impar);
        System.out.println("Total de ceros: " + ceros);
    }
}
