package exercicio2;

public class Ex2{ 
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas Henrique", 20, 1.85, 9, 12, true);

        System.out.println("Nome: " + a1.nome);
        System.out.println("Idade: " + a1.idade);
        System.out.println("Altura: " + a1.altura);
        System.out.println("Nota Final: " + a1.notaFinal);
        System.out.println("Quantidade de faltas: " + a1.notaFinal);
        System.out.println("Situação: " + a1.situacao);
    }

}