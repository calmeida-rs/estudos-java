package curso.nelioalves.exercicios.domain;

import curso.nelioalves.exercicios.entities.Retangle;

import java.util.Scanner;

public class ExecutaRetangulo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangle retangle = new Retangle();
        System.out.println("Digite a base e altura do seu retângulo:");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        retangle.area();
        retangle.perimeter();
        retangle.diagonal();
        retangle.imprime();
    }
}
