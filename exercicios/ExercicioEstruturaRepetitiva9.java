package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double quadrado = 0;
        double cubo = 0;
        for (int i = 1; i <= n; i++) {
            quadrado = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.printf("%d %.1f %.1f%n", i, quadrado, cubo);
        }
    }
}
