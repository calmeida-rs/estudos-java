package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste  = sc.nextInt();
        double calculo;
        for (int i = 0; i < casosTeste; i++) {
            double val1 = sc.nextDouble();
            double val2 = sc.nextDouble();
            double val3 = sc.nextDouble();
            calculo  =  ((2 * val1) + (3 * val2) + (5 * val3)) / (2 + 3 + 5);
            System.out.printf("%.1f%n", calculo);
        }
    }
}
