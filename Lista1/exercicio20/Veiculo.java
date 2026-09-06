package exercicio20;

abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirDados() {
    }
}
