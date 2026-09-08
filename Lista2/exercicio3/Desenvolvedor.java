package Lista2.exercicio3;

public class Desenvolvedor extends Funcionario{
    double adicionalProjetos;

    Desenvolvedor(double salarioBase, double adicionalProjetos) {
        super(salarioBase);
        this.adicionalProjetos = adicionalProjetos;
    }

    @Override 
    public double calcularSalario() {
        return salarioBase + adicionalProjetos;
    }
}
