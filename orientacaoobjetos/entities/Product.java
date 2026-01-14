package curso.nelioalves.orientacaoobjetos.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    /*
    Adicionando um metodo construtor no meu objeto, tem como objetivo fazer com que na sua instanciação, ele seja obrigado a receber valores.
     */
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValeInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public void showProducts(){
        System.out.println("Nome do Produto: "+ name);
        System.out.printf("Preço: %.2f%n", price);
        System.out.println("Quantidade: " + quantity);
        System.out.printf("Total: %.2f%n", totalValeInStock());
    }


}
