package curso.nelioalves.exercicios.domain;

import curso.nelioalves.exercicios.entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Rent {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //primeiro vamos pedir a quantidade de quartos a serem alugados.
        System.out.println("Quantos quartos você quer alugar?");
        int numeroEstudantes = sc.nextInt();
        Rooms[] rooms = new Rooms[10];

        for (int i = 0; i < numeroEstudantes; i++) {
            System.out.println("Digite os dados:");
            System.out.println("Nome");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email");
            String email = sc.next();
            System.out.println("Quarto");
            int quarto = sc.nextInt();
            rooms[quarto] = new Rooms(name, email, quarto);
        }



        System.out.println("Quartos ocupados:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null){
                System.out.println(rooms[i].getRoom() + ":" + " " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }
        sc.close();
    }
}
