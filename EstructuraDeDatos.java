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

    }
}
