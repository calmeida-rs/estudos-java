package curso.nelioalves.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    static void main(String[] args) {
        // lista nao aceita tipo primitivo, tem que usar wrapper class.
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");

        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String tipo: list){
            System.out.println(tipo);
        }
        System.out.println("------------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String tipo: list){
            System.out.println(tipo);
        }

        System.out.println("------------------");
        System.out.println(list.indexOf("Bob"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String tipo: result){
            System.out.println(tipo);
        }

        System.out.println("------------------");
        //basicamente o stream() utiliza a lista como fonte, o filter() utiliza uma expressao lambda.
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }

}
