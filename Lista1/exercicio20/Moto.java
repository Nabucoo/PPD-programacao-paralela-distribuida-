package exercicio20;

public class Moto extends Veiculo {
    protected int cilindrada;

    Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    void exibirDados() {
        System.out.println("Dados");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cilindradas: "+ this.cilindrada);
    }
}
