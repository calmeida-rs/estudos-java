package curso.nelioalves.arraysememoria.application;

import curso.nelioalves.arraysememoria.domain.Product;

import java.util.Scanner;

public class Arrays2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        // da pra usar vect.lenght também, na verdade é até melhor
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;
        System.out.printf("Average price = %.2f%n", avg);

        sc.close();
    }
}
