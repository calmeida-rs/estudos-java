package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i < x; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
