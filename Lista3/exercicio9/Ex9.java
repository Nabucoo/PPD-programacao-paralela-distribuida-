package exercicio9;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException{
        
    //Forma sequencial
    Random gerador = new Random();
    int[][] matriz = new int[5000][5000];
    int soma = 0;
    
    for (int i = 0; i <= 4999; i++) {
        for (int j = 0; j <= 4999; j++) {
            matriz[i][j] = gerador.nextInt();
        }
    }

    long inicio = System.currentTimeMillis();
    for (int i = 0; i <= 4999; i++) {
        for (int j = 0; j <= 4999; j++) {
            soma += matriz[i][j]; 
        }
    }
    long fim = System.currentTimeMillis();

    System.out.println("Forma Sequencial: " + (fim - inicio) + "ms");
    System.out.println("Soma: : " + soma);


    //forma concorrente
    MatrizThread t1 = new MatrizThread(0, 1249);
    MatrizThread t2 = new MatrizThread(1250, 2499);
    MatrizThread t3 = new MatrizThread(2500, 3749);
    MatrizThread t4 = new MatrizThread(3750, 4999);

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

    System.out.println("Forma Concorrente: " + (fim - inicio) + "ms");
    System.out.println("Soma: : " + MatrizThread.soma);
    }
}
