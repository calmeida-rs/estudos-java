package curso.nelioalves.estruturasequencial;

public class FuncoesMatematicas {
    static void main(String[] args) {
        double b = 10;
        double c = 2;
        double a = 6;
        double delta;
        double x1;
        double x2;

        delta = (Math.pow(b, 2.0) - (4*a*c));
        x1 = (-b + Math.sqrt(delta) / 2.0 * a);
        x2 = (-b - Math.sqrt(delta) / 2.0 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
