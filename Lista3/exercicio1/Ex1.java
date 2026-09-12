package exercicio1;

public class Ex1 {
    public static void main(String[] args) {
        long[] numeros = new long[50000000];

        int soma = 0;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 50000000; i++) {
            numeros[i] = 1;
            // desafio: 
            // numeros[i] = 10;
            soma += numeros[i];
        }
        long fim = System.currentTimeMillis();

        System.out.println(fim - inicio);
        System.out.println("Soma: " + soma);
    }
}
