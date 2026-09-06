package exercicio14;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nome;
    List<Funcionario> funcionarios;

    Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void mostrarFuncionarios() {
        if (funcionarios.size() < 1) {
            System.out.println("Não há funcionários!");
        } else {
            System.out.println("Funcionários da empresa " + this.nome);
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.nome);
            }
        }
    }

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        System.out.println("Funcionário adicionado com sucesso!");
    }
}
