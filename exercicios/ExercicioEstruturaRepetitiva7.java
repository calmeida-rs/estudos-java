package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste  = sc.nextInt();
        double divisao = 0;
        for (int i = 0; i < casosTeste; i++) {
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            if (valor2 != 0) {
                divisao = valor1 / valor2;
                System.out.println(divisao);
            } else {
                System.out.println("Divisão impossível");
            }
        }
    }
}
