package Lista2.exercicio14;

public class Ex14 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int soma = 0;
        int maior = numeros[0];

        for (int n : numeros) {
            soma += n;
            maior = (n > maior) ? n : maior;
        }

        double media = (double) soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
    }
}
