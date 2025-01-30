import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        String[] Opciones = {"Piedra", "Papel", "Tijera"};
        Random Random = new Random();
        int Eleccionlap = Random.nextInt(Opciones.length);
        System.out.println("La computadora Escogio " + Opciones[Eleccionlap]);

        
    }
}
