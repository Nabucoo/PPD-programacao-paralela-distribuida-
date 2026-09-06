package exercicio2;

public class Aluno {
    String nome;
    int idade;
    double altura;
    float notaFinal;
    float faltas;
    boolean situacao;

    public Aluno(String nome, int idade, double altura, float notaFinal, int faltas, boolean situacao) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.notaFinal = notaFinal;
        this.faltas = faltas;
        this.situacao = situacao;
    }
}
