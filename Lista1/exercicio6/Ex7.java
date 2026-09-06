package exercicio6;

public class Ex7 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Lucas Henrique";
        a1.idade = 20;
        a1.nota = 6.7;

        Aluno a2 = new Aluno();
        a2.nome = "Matheus Valério";
        a2.idade = 18;
        a2.nota = 4.2;

        a1.exibirDados();
        a2.exibirDados();
    }
}
