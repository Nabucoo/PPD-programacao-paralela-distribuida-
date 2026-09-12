package exercicio10;

import java.util.Random;

public class MatrizThread extends Thread {
    static int[][] matriz;
    int inicio;
    int fim;
    static int menor;
    static int maior;
    static int igual;
    static Random gerador;

    static {
        menor = 0;
        maior = 0;
        igual = 0;
        gerador = new Random();
        matriz = new int[4000][4000]; //bizarro q pra iniciar precisa ser 4000, mas só vi até 3999. Java é coisa de maluco!
        for (int i = 0; i <= 3999; i++) {
                for (int j = 0; j <= 3999; j++) {
                    matriz[i][j] = gerador.nextInt(1, 200);
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
                    if (matriz[i][j] > 100) {
                        maior++;
                    } else if (matriz[i][j] < 100) {
                        menor++;
                    } else {
                        igual++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrompida!\n" + e.getMessage());
        }

    }
}
