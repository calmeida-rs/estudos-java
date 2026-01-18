package curso.nelioalves.exercicios.domain;

import curso.nelioalves.exercicios.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAltura {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int numeroPessoas = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[numeroPessoas];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + i + " pessoa: ");
            System.out.println("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        //calcula a altura média.
        double somaAltura = 0;
        double mediaAltura = 0;
        for (int i = 0; i < pessoa.length; i++) {
            somaAltura += pessoa[i].getAltura();
            mediaAltura = somaAltura / pessoa.length;
        }

        double menorDezesseis = 0;
        String nomes16 = "";
        double pessoasMenorDezesseis = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                menorDezesseis++;
                nomes16 += pessoa[i].getNome()+"\n";
            }
        }
        pessoasMenorDezesseis = (menorDezesseis / pessoa.length) * 100;
        System.out.println("Altura média: " + mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: " + pessoasMenorDezesseis);
        System.out.println(nomes16);


        sc.close();
    }
}
