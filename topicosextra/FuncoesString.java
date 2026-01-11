package curso.nelioalves.topicosextra;

public class FuncoesString {
    static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(3);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("cd");
        int j = original.lastIndexOf("bc");
        System.out.println("deixa tudo em lower case: " + s01);
        System.out.println("deixa tudo em upper case: " + s02);
        System.out.println("retira os espaços excedentes do final: " + s03);
        System.out.println("Cria um outro String começando pelo terceiro caractere (que seria o d): " + s04);
        System.out.println("Cria um outro String mas nesse caso, está informando onde começa e onde termina!: "+s05);
        System.out.println("substitui um char por outro char: "+s06);
        System.out.println("substitui uma string por outra: "+s07);
        System.out.println("retorna a posição inicial da string informada: "+i);
        System.out.println("retorna a posição final da string informada: "+j);

        String exemplo = "Carlos Eduardo Azevedo";
        //aqui usamos o split que realiza uma separação de acordo com uma marcação específica, tipo um espaço. E armazena
        //em um array.
        String[] nomes = exemplo.split(" ");
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        //vamos usar isso pra separar as frases de um parágrafo!
        String paragrafo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc finibus nec turpis non luctus. Vestibulum at egestas erat. Sed quis porttitor nulla. Phasellus felis quam, rhoncus vitae ultrices at, tempor et risus. In in molestie dolor. Donec porta augue sed mauris tristique, quis convallis justo facilisis. In aliquam libero nisi, et vulputate felis cursus ut. Donec tristique id neque ac posuere. Cras vel turpis eros. Suspendisse velit nisl, pretium ut aliquet in, fringilla vel turpis. Ut nisi felis, iaculis sed feugiat eget, dapibus ut ex. Suspendisse eu metus vitae ipsum luctus ultrices id quis dolor. Donec fermentum rhoncus nunc nec bibendum. Quisque orci dolor, fermentum in dui nec, tempus varius ex.";
        String[] frase = paragrafo.split("\\.");
        //usei um laço de repetição para percorrer cada posição do array, já que não sei o tamanho.
        for (String percorre: frase){
            System.out.println(percorre);
        }
        //adicionando um comentário para teste
    }
}
