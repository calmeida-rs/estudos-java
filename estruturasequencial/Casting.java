package curso.nelioalves.estruturasequencial;

public class Casting {
    static void main(String[] args) {
        int a,b;
        double resultado;

        a = 5;
        b = 2;
        //posso usar o casting para forçar o tipo do valor
        resultado = (double) a/b;
        System.out.println(resultado);

        //outro exemplo
        double c = 10.5;
        int d;
        d = (int)c;
        System.out.println(d);
    }
}
