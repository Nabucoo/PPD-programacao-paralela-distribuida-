package Lista2.exercicio1;

public class Carro extends Veiculo {
    int quantidadePortas;

    Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirDados() {
        System.out.println("DADOS");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Portas: " + this.quantidadePortas);
    }
}
