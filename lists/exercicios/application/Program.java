package curso.nelioalves.lists.exercicios.application;

import curso.nelioalves.lists.exercicios.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Digite quantos empregados serão registrados:");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1 ; i++) {
            System.out.println("Digite os dados do " + i + " empregado");
            System.out.println("ID:");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome:");
            String name = sc.nextLine();
            System.out.println("Salario:");
            Double salary = sc.nextDouble();
            Employee empregado = new Employee(id, name, salary);
            list.add(empregado);
        }
        System.out.println("Digite o ID do funcionario que deseja realizar o aumento:");
        int idSalary = sc.nextInt();

// Tenta encontrar o funcionário na lista pelo ID
// O 'orElse(null)' garante que se não achar, a variável 'emp' fica nula
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Esse ID não existe!");
        } else {
            System.out.println("Digite a porcentagem:");
            double percent = sc.nextDouble();
            // Chamamos o método que criamos na classe Employee
            emp.increaseSalary(percent);
        }

// Parte final: Listar os dados atualizados
        System.out.println();
        System.out.println("Lista de empregados:");
        for (Employee e : list) {
            System.out.println(e.getId()+ " " + e.getName() + " " + e.getSalary() ); // Dica: Implemente o método toString() na classe Employee para ficar bonito
        }

        sc.close();




    }
}
