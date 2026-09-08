package Lista2.exercicio3;

public class Gerente extends Funcionario{
    double bonificacao;

    Gerente(double salarioBase, double bonificacao) {
        super(salarioBase);
        this.bonificacao = bonificacao;
    }

    @Override 
    public double calcularSalario() {
        return this.salarioBase + bonificacao;
    }
}
