package curso.nelioalves.exercicios.domain;

import curso.nelioalves.exercicios.entities.Empregado;

import java.util.Scanner;

public class CalculoSalario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.println("Digite os dados do empregado:");
        empregado.nome = sc.next();
        empregado.salario = sc.nextDouble();
        empregado.imposto = sc.nextDouble();
        empregado.salarioReduzido();
        empregado.imprimeSalarioReduzido();
        double reduz = sc.nextDouble();
        empregado.salarioAumentado(reduz);
        empregado.imprimeSalarioAumentado(reduz);


    }
}
