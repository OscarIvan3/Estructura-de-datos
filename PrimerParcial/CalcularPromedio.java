package PrimerParcial;
//Oscar Aragon 
//14715
//10/02/2025
//Calcumamos parcial
public class CalcularPromedio {

    // Calcular calificación parcial
    public int CalculatePartialGrade(int ExamScore, int homeworkScore) {
        double FirstPartialGrade = (ExamScore * 0.7 + homeworkScore * 0.3);
        return (int) FirstPartialGrade;
    }
    

    // Calcular promedio de calificaciones
    public int CalculateFinalGrade(int firstpartial, int secondpartial, int thirdpartial, int finalExam) {
        double finalGrade = ((((firstpartial + secondpartial + thirdpartial) / 3) * 0.5) + (finalExam * 0.5));
        return (int) finalGrade;
    }

    // Calcular faltas y si pasa o no el alumno
    public String checkFailureByAbsences(int totalHours, int absences) {
        double absencesPercentage = (((double) absences / totalHours) * 100);
        if (absencesPercentage < 10) {
            return "Alumno cumple con las asistencias mínimas";
        } else {
            return "Alumno No cumple con las asistencias mínimas";
        }
    }
}

        

    

