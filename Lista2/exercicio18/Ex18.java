package Lista2.exercicio18;
import java.util.ArrayList;

public class Ex18 {
    public static void main(String[] args) {
        ArrayList<String> compras = new ArrayList<>();

        compras.add("leite");
        compras.add("açucar");
        compras.add("café");
        compras.add("arroz");
        
        compras.remove(1);

        System.out.println(compras);

        System.out.println("Tem leite? ");
        System.out.println(compras.contains("leite") ? "Sim\n" : "Não\n");

        System.out.println("Exibindo todas compras: ");
        for (String i : compras) {
            System.out.println(i);
        }
    }
}
