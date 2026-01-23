package curso.nelioalves.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    static void main(String[] args) {
        //declaracao e instanciacao da nossa lista. So aceita wrapper classes, nao aceita tipos primitivos
        List<String> list = new ArrayList<String>();

        //vamos adicionar alguns elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        //list.add(index, element) serve para especificar em qual posicao o valor entra.
        list.add(2, "Marco");
        //vamos visualizar o tamanho da lista
        System.out.println(list.size());
        //vamos imprimir os valores da lista.
        list.forEach(System.out::println);
        System.out.println("---------------------");
        //agora vamos usar uma expressao lambda para remover um elemento que satisfaca um determinado valor. Isso basica
        //mente remove os elementos que a na posicao 0 tenham o char M.
        list.removeIf(x -> x.charAt(0) == 'M');
        list.forEach(System.out::println);

        //agora digamos que eu queria realizar uma filtragem da lista de acordo com determinado criterio.
        //vamos criar uma lista pra armazenar o resultado dessa filtragem.
        System.out.println("-----------------");
        //com as novas versoes do java, nao e mais necessario usar o collect. MAS a lista nao e mais editavel, nao da pra usar o add por exemplo!
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        resultado.forEach(System.out::println);
        System.out.println("-----------------------");
        //vamos criar outro cenario onde eu deseje pegar o primeiro elemento que contem aquele filtro. O orElse diz pra retornar outro valor
        //caso nao tenha encontrado nenhuma compatibilidade com o filtro.
        String resultadoFiltro = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(resultadoFiltro);



    }
}
