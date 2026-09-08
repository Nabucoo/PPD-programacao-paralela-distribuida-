package Lista2.exercicio15;

public class Ex15 {
    public static void main(String[] args) {
        Estudante[] estudantes = {
            new Estudante(7, "Lucas Henrique"), 
            new Estudante(9, "Ranny Fábela"), 
            new Estudante(8, "Luiz Gustavo")
        };

        for (Estudante e : estudantes) {
            System.out.println("Nome: " + e.nome);
            System.out.println("Ra: " + e.ra);
            System.out.println();
        }

    }
}
