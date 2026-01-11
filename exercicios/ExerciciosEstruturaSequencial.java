package curso.nelioalves.exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, quadrado, circulo, trapezio, trianguloR, retangulo, pi;
        pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        quadrado = Math.pow(B, 2.0);
        circulo = pi * Math.pow(C, 2.0);
        trapezio = ((A + B) * C)/2;
        trianguloR = A * C /2;
        retangulo = A * B;
        System.out.printf("Trapezio: %.3f%n", trianguloR);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f", retangulo);



    }
}
