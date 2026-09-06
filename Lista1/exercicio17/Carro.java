package exercicio17;

public class Carro extends VeiculoTerrestre {
    String modelo;

    Carro(int rodas, String modelo) {
        super(rodas);
        this.modelo = modelo;
        System.out.println("Um Carro!");
    }

    void exibirModelo() {
        System.out.println("Modelo: " + this.modelo);
    }
}
