package curso.nelioalves.orientacaoobjetos.domain;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;

    //construtor padrão
    public Account(String name, int accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //métodos de acesso.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    //metodo de depósito
    public void fazDeposito(double value){
        this.balance += value;
    }
    //metodo de saque
    public void fazSaque(double value){
        this.balance = this.balance - 5 - value;
    }


}
