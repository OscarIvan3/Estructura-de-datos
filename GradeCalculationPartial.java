//Oscar Aragon
//14715
//Ejercicio de examen


import java.util.Scanner;

public class GradeCalculationPartial {
    public double calculateFinal(double examPartial, double assignments) {
        double finalGrade = (examPartial * 0.7) + (assignments * 0.30);
        return finalGrade;
    }
    
    public void CalculateFinalGrade(double examPartial, double assignments) {
        double finalGrade = (examPartial * 0.6) + (assignments * 0.4);
        System.out.println("Final grade: " + finalGrade);
            
        }
    }
        
