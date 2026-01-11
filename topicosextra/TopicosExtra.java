package curso.nelioalves.topicosextra;

public class TopicosExtra {
    static void main(String[] args) {
        // o operador usado ele compara byte a byte, por isso coloco uma máscara para utilziar de comparação.

        int numero = 113;
        int mask = 0b100000;
        if ((numero & mask) != 0){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
