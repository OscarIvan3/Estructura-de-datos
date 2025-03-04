package PrimerParcial;
//Oscar Aragon 
//14715
//Piedra papel o tijera
//05/02/2025
import java.util.Random;
//importamos random

//creamos clase (Siemore mayusculas)
public class PiedraPapelTijera {
    //creamos el string y designamos de 0 a 2 
    public static void main(String[] args) {
        String[] Opciones = {"Piedra", "Papel", "Tijera"};
        Random Random = new Random();
        int Eleccionlap = Random.nextInt(Opciones.length);
        System.out.println("La computadora Escogio " + Opciones[Eleccionlap]);
//imprimimos y listo
        
    }
}
