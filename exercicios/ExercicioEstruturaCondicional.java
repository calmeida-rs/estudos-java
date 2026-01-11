package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaCondicional {
    static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
         */
        Scanner sc = new Scanner(System.in);
        double salario, imposto;
        salario = sc.nextDouble();
        if(salario >= 0.0 && salario <= 2000.0){
            System.out.println("isento");
        } else if (salario > 2000.0 && salario <= 3000.0) {
            imposto = (salario - 1000) * 0.08;
            System.out.println(imposto);
        } else if (salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.println(imposto);
        } else if (salario > 4500){
            imposto = (salario - 4500) * 0.28 + 1500 *0.18 + 1000.0 * 0.08;
            System.out.println(imposto);
        }
    }
}
