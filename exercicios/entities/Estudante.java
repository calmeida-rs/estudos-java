package curso.nelioalves.exercicios.entities;

public class Estudante {
    public String nome;
    public double tri1;
    public double tri2;
    public double tri3;

    public String calculoNota(){
        if(tri1 + tri2 + tri3 >= 60.0){
            double resultado = tri1 + tri2 + tri3;
            return String.format("APROVADO%nNOTA FINAL = %.2f", resultado);
        } else{
            double resultado = tri1 + tri2 + tri3;
            double pontos = 60 - (tri1 + tri2 + tri3);
            return String.format("REPROVADO%nNOTA FINAL = %.2f%nFALTAM %.2f PONTOS", resultado, pontos);
        }
    }
}
