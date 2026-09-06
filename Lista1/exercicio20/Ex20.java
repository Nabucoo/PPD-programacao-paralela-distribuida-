package exercicio20;

public class Ex20 {
    public static void main(String[] args) {
        Veiculo c1 = new Carro("Chevrolet", "Cobalt", 2013, 4);
        Veiculo m1 = new Moto("Honda", "Nx", 2004, 400);

        c1.exibirDados();
        m1.exibirDados();
    }
}
