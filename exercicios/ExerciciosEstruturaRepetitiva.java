package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExerciciosEstruturaRepetitiva {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        while (senha != 2002){
            System.out.println("Senha incorreta, digite novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta!");
    }
}
