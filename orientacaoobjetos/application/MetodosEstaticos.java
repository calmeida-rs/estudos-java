package curso.nelioalves.orientacaoobjetos.application;

import curso.nelioalves.orientacaoobjetos.domain.Calculator;

import java.util.Scanner;

public class MetodosEstaticos {
    //padrao de constantes é tudo maiusculo
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        //caso a calculadora seja estática, não tem necessidade, caso eu tivesse vários cálculos seria diferente
        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI VALUE: %.2f", Calculator.PI);

    }
}
