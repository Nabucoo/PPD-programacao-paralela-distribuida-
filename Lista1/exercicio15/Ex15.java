package exercicio15;

public class Ex15 {
    public static void main(String[] args) {
        Casa c1 = new Casa();

        c1.listarComodos();

        c1.adicionarComodo(new Comodo("Sala"));
        c1.adicionarComodo(new Comodo("Cozinha"));
        c1.adicionarComodo(new Comodo("Banheiro"));
        c1.adicionarComodo(new Comodo("Quarto 1"));
        c1.adicionarComodo(new Comodo("Quarto 2"));
        c1.adicionarComodo(new Comodo("Suite"));
        c1.adicionarComodo(new Comodo("Lavanderia"));

        c1.listarComodos();
    }
}
 
