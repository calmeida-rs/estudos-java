package curso.nelioalves.estruturasequencial;
import java.util.Scanner;

public class EntradaDeDados {
    static void main(String[] args) {
        //assim inicializamos um scanner.
        Scanner escaneia = new Scanner(System.in);
        int x = escaneia.nextInt();
        escaneia.nextLine();
        String dado1 = escaneia.nextLine();
        String dado2 = escaneia.nextLine();
        String dado3 = escaneia.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);

        //como fazer a leitura de um char como entrada
        char sexo = escaneia.next().charAt(0);
        //assim podemos ler o primeiro caractere, na posição 0.
    }
}
