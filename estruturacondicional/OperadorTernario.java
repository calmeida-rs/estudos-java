package curso.nelioalves.estruturacondicional;

import java.util.Scanner;

public class OperadorTernario {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        double desconto = (preco < 25.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
