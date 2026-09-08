package Lista2.exercicio19;

import java.util.LinkedList;

public class Ex19 {

    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<String>();

        fila.add("Lucas");
        fila.add("Ranny");
        fila.add("Peixe");
        fila.add("Ryquelme");

        System.out.println(fila);

        String removido = fila.poll();

        System.out.println("Atendido: " + removido);
        System.out.println("Nova fila: " + fila);
    }

}
