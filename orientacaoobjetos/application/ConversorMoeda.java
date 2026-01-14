package curso.nelioalves.orientacaoobjetos.application;

import curso.nelioalves.orientacaoobjetos.entities.Moeda;

import java.util.Scanner;

public class ConversorMoeda {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação:");
        double x = sc.nextDouble();
        System.out.println("Digite quantos dólares deseja:");
        double y = sc.nextDouble();
        double result = Moeda.calculaDolar(x, y);
        System.out.println(result);
    }
}
