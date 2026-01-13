package curso.nelioalves.exercicios.entities;

public class Empregado {
    public String nome;
    public double salario;
    public double imposto;

    public double salarioReduzido(){
        return salario - imposto;
    }
    public double salarioAumentado(double x){
        double valorFinal =  salario + ((salario * x) / 100.0);
        return valorFinal;
    }

    public void imprimeSalarioReduzido(){
        System.out.printf("Empregado: %s, $%.2f", nome, salarioReduzido());
    }
    public void imprimeSalarioAumentado(double x){
        System.out.printf("Empregado: %s, $%.2f", nome, salarioAumentado(x));
    }

}
