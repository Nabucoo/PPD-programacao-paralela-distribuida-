package exercicio9;

import java.util.Random;

public class MatrizThread extends Thread {
    static int[][] matriz;
    int inicio;
    int fim;
    static int soma;
    static Random gerador;

    static {
        soma = 0;
        gerador = new Random();
        matriz = new int[5000][5000]; //bizarro q pra iniciar precisa ser 4000, mas só vi até 3999. Java é coisa de maluco!
        for (int i = 0; i <= 4999; i++) {
                for (int j = 0; j <= 4999; j++) {
                    matriz[i][j] = gerador.nextInt();
                }
            }
    }

    MatrizThread(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        try {
            for (int i = this.inicio; i <= this.fim; i++) {
                for (int j = this.inicio; j <= this.fim; j++) {
                    soma += matriz[i][j];
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrompida!\n" + e.getMessage());
        }

    }
}
