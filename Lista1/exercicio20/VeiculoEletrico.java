package exercicio20;

interface VeiculoEletrico {
    default void carregarBateria() {
        System.out.println("Carregando...");
    };
}
