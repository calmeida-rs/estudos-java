package curso.nelioalves.exercicios;

import java.util.Scanner;

public class ExercicioEstruturaRepetitiva3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gasolina, alcool, diesel, entrada;
        gasolina = 0;
        alcool = 0;
        diesel = 0;
        entrada = sc.nextInt();
        while(entrada != 4){
            if(entrada == 1){
                alcool += 1;
            } else if (entrada ==2) {
                gasolina += 1;
            } else if(entrada == 3){
                diesel += 1;
            }
            entrada = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Álcool: " + alcool);
        System.out.println("Diesel: " + diesel);

    }
}
