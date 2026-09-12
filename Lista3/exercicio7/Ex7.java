package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException{
        int qntThreads = 16;
        long soma = 0;
        long[] numeros = new long[49999999];
        int qntPraCada = 50000000 / qntThreads;

        List<SumThread> threads = new ArrayList<SumThread>();

        int inicio = 0;
        for (int i = 0; i < qntThreads; i++) {
            threads.add(new SumThread(numeros, inicio, inicio + qntPraCada - 1));
            inicio += qntPraCada - 1;
        }


        long inicioTime = System.currentTimeMillis();

        threads.forEach(SumThread::start);

        for (SumThread t : threads) {
            t.join();
            soma += t.getSomaParcial();
        }
        long fimTime = System.currentTimeMillis();

        System.out.println("Tempo de espera: " + (fimTime - inicioTime) + "ms");
        System.out.println("Total de threads: " + qntThreads);
        System.out.println("Soma total: " + soma);
    }
}
