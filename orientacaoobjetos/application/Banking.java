package curso.nelioalves.orientacaoobjetos.application;

import curso.nelioalves.orientacaoobjetos.domain.Account;

import java.util.Locale;
import java.util.Scanner;

public class Banking {
    static void main(String[] args) {
        Account account;
        int accountNumber;
        String name;
        char response;
        double balance = 0;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        accountNumber = sc.nextInt();
        System.out.println("Enter account holder:");
        name = sc.next();
        System.out.println("Is there an initial deposit (y/n)?");
        response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit value:");
            balance = sc.nextDouble();
            account = new Account(name, accountNumber, balance);
        } else{
            account = new Account(name, accountNumber);
        }
        System.out.printf("Account data:%nAccount %d, Holder: %s, Balance: $%.2f%n", account.getAccountNumber(), account.getName(), account.getBalance());

        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.fazDeposito(depositValue);
        System.out.printf("Updated account data:%nAccount %d, Holder: %s, Balance: $%.2f%n", account.getAccountNumber(), account.getName(), account.getBalance() );

        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.fazSaque(withdrawValue);
        System.out.printf("Updated account data:%nAccount %d, Holder: %s, Balance: $%.2f%n", account.getAccountNumber(), account.getName(), account.getBalance() );




    }
}
