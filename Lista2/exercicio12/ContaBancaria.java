package Lista2.exercicio12;

public class ContaBancaria {
    double saldo;

    ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        } else {
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
        }
    }
}
