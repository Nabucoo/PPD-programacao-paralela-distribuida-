package exercicio17;

public class VeiculoTerrestre extends Veiculo {
    int rodas;

    VeiculoTerrestre(int rodas) {
        this.rodas = rodas;
        System.out.println("Um veículo terrestre!");
    }

    void quantidadeRodas() {
        System.out.println("Quantidade de rodas: " + this.rodas);
    }
}
