package curso.nelioalves.exercicios.domain;

import curso.nelioalves.exercicios.entities.Estudante;

import java.util.Scanner;

public class Notas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do estudante:");
        estudante.nome = sc.nextLine();
        System.out.println("Digite a nota do primeiro trimestre:");
        estudante.tri1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo trimestre:");
        estudante.tri2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre:");
        estudante.tri3 = sc.nextDouble();

        estudante.calculoNota();
        System.out.println(estudante.calculoNota());
    }
}
