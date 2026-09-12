package exercicio3;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] numeros = new int[50000000];

        //preenchendo
        for (int i = 0; i < 50000000; i++) {
            numeros[i] = gerador.nextInt();
        }

        int pares = 0;
        int impares = 0;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 50000000; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Número de pares: " + pares);
        System.out.println("Numero de impares: " + impares);
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
