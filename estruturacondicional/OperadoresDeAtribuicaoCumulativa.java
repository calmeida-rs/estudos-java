package curso.nelioalves.estruturacondicional;

import java.util.Scanner;

public class OperadoresDeAtribuicaoCumulativa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 50;
        int numero = sc.nextInt();
        if(numero > 100){
            // pode usar +=, *=, -=, /=, %=
            valor += (numero -100) * 2;
            System.out.println(valor);
        }
        sc.close();
    }
}
