package curso.nelioalves.orientacaoobjetos.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
