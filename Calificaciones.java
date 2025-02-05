public class Calificaciones {
    public static void main(String[] args) {
        double[] calificaciones = {85.5, 90.0, 78.5};

        double suma = 0.0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        double promedio = suma / calificaciones.length;
        System.out.println("Calificaciones:");
        for (double calificacion : calificaciones) {
            System.out.println(calificacion);
        }
        
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio final: " + promedio);
    }
}
