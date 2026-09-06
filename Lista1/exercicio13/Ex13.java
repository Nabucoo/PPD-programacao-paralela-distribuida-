package exercicio13;

public class Ex13 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Lineu";

        Disciplina d1 = new Disciplina();
        d1.nome = "Programação Paralela e Distribuida";
        d1.professor = p1;

        System.out.println("Disciplina: " + d1.nome);
        System.out.println("Professor: " + d1.professor.nome);
    }
}
