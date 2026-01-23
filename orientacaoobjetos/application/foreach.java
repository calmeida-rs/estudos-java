package curso.nelioalves.orientacaoobjetos.application;

public class foreach {
    static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        // metodo mais simplificado usando foreach
        for (String obj: vect){
            System.out.println(obj);
        }

        Integer inteiro = 10;
        System.out.println(inteiro);

    }
}
