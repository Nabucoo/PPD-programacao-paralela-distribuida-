package exercicio2;
import java.util.Random;
public class Ex2 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] numeros = new int[50000000];

        //preenchendo
        for (int i = 0; i < 50000000; i++) {
            numeros[i] = gerador.nextInt();
        }

        //Fiz em loops isolados, para poder medir o tempo.

        //Maior valor
        int maior = numeros[0];
        int indiceMaior = 0;


        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
                indiceMaior = i;
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("\nMaior: " + maior);
        System.out.println("Indice: " + indiceMaior);
        System.out.println("Tempo de demora: " + (fim - inicio) + "ms");

        //Menor valor
        int menor = numeros[0];
        int indiceMenor = 0;

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
                indiceMenor = i;
            }
        }
        fim = System.currentTimeMillis();

        System.out.println("\nMenor: " + menor);
        System.out.println("Indice: " + indiceMenor);
        System.out.println("Tempo de demora: " + (fim - inicio) + "ms");
    }
}
