package exercicio14;

public class Ex14 {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Crenata");

        empresa1.mostrarFuncionarios();

        Funcionario f1 = new Funcionario("Lucas Henrique", 20);
        Funcionario f2 = new Funcionario("Geazi Hernique", 22);
        Funcionario f3 = new  Funcionario("Vinícius César", 21);

        empresa1.adicionarFuncionario(f1);
        empresa1.mostrarFuncionarios();

        empresa1.adicionarFuncionario(f2);
        empresa1.adicionarFuncionario(f3);
        empresa1.mostrarFuncionarios();
    }
}
