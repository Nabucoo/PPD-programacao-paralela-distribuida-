package exercicio10;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) throws InterruptedException{
        
        //Sequencial
        int[][] matriz = new int[4000][4000];
        Random gerador = new Random();
        int maior = 0;
        int menor = 0;
        int igual = 0;

        //Preenchendo
        for(int i = 0; i <= 3999; i++) {
            for (int j = 0; j <= 3999; j++) {
                matriz[i][j] = gerador.nextInt(1, 200);
            }
        }

        long inicio = System.currentTimeMillis();
        for(int i = 0; i <= 3999; i++) {
            for (int j = 0; j <= 3999; j++) {
                if (matriz[i][j] > 100) {
                    maior++;
                } else if (matriz[i][j] < 100) {
                    menor++;
                } else {
                    igual++;
                }
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("Sequencial");
        System.out.println("Maiores que 100: " + maior);
        System.out.println("Menores que 100: " + menor);
        System.out.println("Iguais a 100: " + igual);
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms\n");



        //forma concorrente
        MatrizThread t1 = new MatrizThread(0, 999);
        MatrizThread t2 = new MatrizThread(1000, 1999);
        MatrizThread t3 = new MatrizThread(2000, 2999);
        MatrizThread t4 = new MatrizThread(3000, 3999);

        inicio = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        fim = System.currentTimeMillis();

        System.out.println("Concorrente");
        System.out.println("Maiores que 100: " + MatrizThread.maior);
        System.out.println("Menores que 100: " + MatrizThread.menor);
        System.out.println("Iguais a 100: " + MatrizThread.igual);
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
