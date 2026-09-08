package Lista2.exercicio20;

import java.util.ArrayList;
import java.util.Collections;

public class Ex20 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);
        numeros.add(21);
        numeros.add(28);
        numeros.add(91);
        numeros.add(1);
        numeros.add(7);

        System.out.println("Lista original: " + numeros);


        Collections.sort(numeros);
        System.out.println(".sort(): " + numeros);


        Collections.reverse(numeros);
        System.out.println(".reverse(): " + numeros);

        System.out.println(Collections.binarySearch(numeros, 17));
    }
}
