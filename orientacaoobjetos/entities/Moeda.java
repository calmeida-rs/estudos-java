package curso.nelioalves.orientacaoobjetos.entities;

public class Moeda {
    public static double calculaDolar(double price, double quantity){
        return quantity * price * 1.06;
    }
}
