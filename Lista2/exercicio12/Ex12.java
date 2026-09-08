package Lista2.exercicio12;

public class Ex12 {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(2000);

        try {
            c1.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}
