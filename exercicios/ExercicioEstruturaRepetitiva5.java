package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valoresaSeremLidos = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < valoresaSeremLidos; i++) {
            int valores = sc.nextInt();
            if(valores >= 10 && valores <= 20){
                in++;
            } else{
                out++;
            }
        }
        System.out.println("Valores dentro: " + in);
        System.out.println("Valores fora: " + out);
    }
}
