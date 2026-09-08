package Lista2.exercicio3;

public class Ex3 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1628);
        Gerente g1 = new Gerente(3000, 1300);
        Desenvolvedor d1 = new Desenvolvedor(3700, 900);

        System.out.println(f1.calcularSalario());
        System.out.println(g1.calcularSalario());
        System.out.println(d1.calcularSalario());
    }
}
