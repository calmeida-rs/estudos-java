package curso.nelioalves.orientacaoobjetos.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //podemos deixar um construtor padrão também pra não necessitar digitar os valores na instanciação do objeto.
    public Product(){

    }
    /*
    Adicionando um metodo construtor no meu objeto, tem como objetivo fazer com que na sua instanciação, ele seja obrigado a receber valores.
     */
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        //nao tem necessidade de iniciar o valor, já que o java começa com 0
    }

    //criando as regras de encapsulamento
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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
