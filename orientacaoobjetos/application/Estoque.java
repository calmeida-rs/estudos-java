package curso.nelioalves.orientacaoobjetos.application;

import curso.nelioalves.orientacaoobjetos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Name");
        product.name = sc.nextLine();
        System.out.println("Price");
        product.price = sc.nextDouble();
        System.out.println("Quantity");
        product.quantity = sc.nextInt();
        product.showProducts();
        System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        product.showProducts();
        System.out.println("Entre com o número de produtos para serem excluidos do estoque: ");
        int quantity2 = sc.nextInt();
        product.removeProducts(quantity2);
        product.showProducts();
        sc.close();

    }
}
