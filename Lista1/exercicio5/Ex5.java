package exercicio5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Todos Elementos: " + numeros);
        System.out.println("Primeiro Elemento: " + numeros[0]);
        System.out.println("Último Elemento: " + numeros[numeros.length - 1]);
        System.out.println("Soma Elementos: " + Arrays.stream(numeros).sum());
        System.out.println("Média Elementos: " + Arrays.stream(numeros).sum() / numeros.length);
    }
}
