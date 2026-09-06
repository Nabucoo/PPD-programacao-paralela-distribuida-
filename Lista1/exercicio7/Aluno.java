package exercicio7;

public class Aluno {
    String nome;
    int idade;
    double nota;

    Aluno (String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota: " + this.nota);
    }
}
