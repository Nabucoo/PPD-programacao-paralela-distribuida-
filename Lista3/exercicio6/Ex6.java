package exercicio6;

import java.util.List;

public class Ex6 {
    
    public static void main(String[] args) throws InterruptedException{

        long[] numeros = new long[50000000];
        long soma = 0;

        SumThread t1 = new SumThread(numeros, 0, 12500000);
        SumThread t2 = new SumThread(numeros, 12500000, 25000000);
        SumThread t3 = new SumThread(numeros, 25000000, 37500000);
        SumThread t4 = new SumThread(numeros, 37500000, 50000000);

        List<SumThread> threads = List.of(t1, t2, t3, t4);

        long inicio = System.currentTimeMillis();
        threads.forEach(SumThread::start);

        for (SumThread t : threads) {
            t.join();
            soma += t.getSomaParcial();
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo demorado: " + (fim - inicio) + "ms");
        System.out.println("Soma total: " + soma);

        // 1 thread: 35ms 
        // 2 threads: 30ms
        // 4 threads: 35ms


    }
}
