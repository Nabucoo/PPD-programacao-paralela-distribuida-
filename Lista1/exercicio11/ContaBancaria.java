package exercicio11;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += valor;
            System.out.println("Valor de R$" + valor + " depositado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo -= valor;
            System.out.println("Valor de R$" + valor + " sacado com sucesso!");
        }
    }
}
