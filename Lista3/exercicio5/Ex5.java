package exercicio5;

public class Ex5 {
    public static void main(String[] args) throws InterruptedException {

        long[] numeros = new long[49999999];

        

        SumThread t1 = new SumThread(numeros, 0, 24999999);
        SumThread t2 = new SumThread(numeros, 25000000, 49999999);

        long inicio = System.currentTimeMillis();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long fim = System.currentTimeMillis();

        System.out.println("Tempo demorado: " + (fim - inicio) + "ms");

        System.out.println("Soma final: " + (t1.getSomaParcial() + t2.getSomaParcial()));
    }
}
