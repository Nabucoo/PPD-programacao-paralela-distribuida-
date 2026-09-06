package exercicio20;

public class Carro extends Veiculo implements VeiculoEletrico {
    protected int portas;

    Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override 
    public void exibirDados() {
        System.out.println("Dados");

        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Portas: " + this.portas);
    }
}
