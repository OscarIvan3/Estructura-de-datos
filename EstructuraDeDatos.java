import java.util.Scanner;

import javax.swing.SortOrder;

public class EstructuraDeDatos {
    public static void main(String[] args) {
        Calificaciones Calificaciones = new Calificaciones();
        Calificaciones.main(args);

        clase clase = new clase();
        clase.main (args);


        PiedraPapelTijera PiedraPapelTijera = new PiedraPapelTijera();
        PiedraPapelTijera.main(args);

        UserData UserData = new UserData();
        System.out.println(UserData.Fullname("Oscar","Aragon"));
        
        CalcularPromedio student = new CalcularPromedio();
        
        // Calcular la calificación del parcial
        int partialGrade = student.CalculatePartialGrade(85, 90);
        System.out.println("Calificación del parcial: " + partialGrade);
        
        // Calcular la calificación final del semestre
        int finalGrade = student.CalculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificación final del semestre: " + finalGrade);
        
        // Verificar el estatus de asistencia
        String attendanceStatus = student.checkFailureByAbsences(64, 7);
        System.out.println(attendanceStatus);

        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triangulo ");
        double base = objScanner.nextDouble();
        System.out.print("Ingresa la altura del triangulo ");
        double heigth = objScanner.nextDouble();

        TraingleArea objTriangle = new TraingleArea();
        double triangleArea = objTriangle.calculateArea((base), heigth);

        System.out.println(String.format("El area del triangulo con base %.2f y altura %.2f es %.2f", base, heigth, triangleArea));

        Scanner objScanner2 = new Scanner(System.in);
        System.out.print("Ingresa el radio del circulo");

        double radius = objScanner2.nextDouble();

        CircleArea objCircleArea = new CircleArea();
        double circleArea = objCircleArea.calculateArea(radius);
        System.out.println(String.format("El area del circulo es %.2f", circleArea));
        objScanner2.close();

        MultiDimensionalArrays objMultiDimensionalArrays = new MultiDimensionalArrays();
        objMultiDimensionalArrays.printbidimensionalArray();
    }
}
