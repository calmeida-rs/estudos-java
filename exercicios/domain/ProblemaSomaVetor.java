package curso.nelioalves.exercicios.domain;

import java.util.Scanner;

public class ProblemaSomaVetor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];

        //adiciona os valores para o vetor de tamanho n
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            media += vect[i];
        }
        media = media / vect.length;

        System.out.println("VALORES: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}
