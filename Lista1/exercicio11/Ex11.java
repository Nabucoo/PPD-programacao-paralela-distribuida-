package exercicio11;

public class Ex11 {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();

        System.out.println(minhaConta.getTitular());
        minhaConta.depositar(1628);
        System.out.println(minhaConta.getSaldo());
        minhaConta.sacar(200);
        System.out.println(minhaConta.getSaldo());

    }
}
