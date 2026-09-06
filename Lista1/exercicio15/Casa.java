package exercicio15;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    List<Comodo> comodos;

    Casa() {
        this.comodos = new ArrayList<Comodo>();
    }

    public void listarComodos() {
        if (comodos.size() < 1) {
            System.out.println("A casa não tem comodos (era uma casa muito engraçada)!");
        } else {
            for (Comodo comodo : comodos) {
                System.out.println(comodo.nome);
            }
        }
    }

    public void adicionarComodo(Comodo c) {
        comodos.add(c);
        System.out.println("Comodo adicionado com sucesso!");
    }
}
