package curso.nelioalves.orientacaoobjetos.application;

public class boxingunboxingwrapper {
    static void main(String[] args) {
        //boxing significa encaixotar uma variavel de tipo primitivo em um objeto. Unboxing e o contrario
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        int y = (int)obj;
        System.out.println(y);

        //wrapper classes sao classes que representam os tipos primitivos, tem como vantagem poder definir valores nulos, que nao sao aceitos por tipos primitivos
        String text = "carlos almeida";
        // por isso que strings aceitam o valor null por padrao, pois nao e um tipo primitivo, e uma wrapper class.
        Integer numero = null;
        // como estamos falando de tipos wrapper agora o int aceita o null.
        Float numeoroFlutuante = 10.0F;
        // e claro podemos definir os valores normais tambem.


    }
}
