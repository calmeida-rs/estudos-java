package curso.nelioalves.orientacaoobjetos.application;

import curso.nelioalves.orientacaoobjetos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Price");
        double price = sc.nextDouble();
        System.out.println("Quantity");
        int quantity = sc.nextInt();
        /*
        Já entra recebendo os atributos, porém não pode ser inicializado antes.
         */
        Product product = new Product(name, price, quantity);
        product.showProducts();
        System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        product.showProducts();
        System.out.println("Entre com o número de produtos para serem excluidos do estoque: ");
        int numeroExcluir = sc.nextInt();
        product.removeProducts(numeroExcluir);
        product.showProducts();
        sc.close();

    }
}
