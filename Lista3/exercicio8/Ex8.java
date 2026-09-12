package exercicio8;

public class Ex8 {
    public static void main(String[] args) throws InterruptedException{
        MatrizThread t1 = new MatrizThread(0, 999);
        MatrizThread t2 = new MatrizThread(1000, 1999);
        MatrizThread t3 = new MatrizThread(2000, 2999);
        MatrizThread t4 = new MatrizThread(3000, 3999);

        long inicio = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execuçao das threads: " + (fim - inicio) + "ms");
    }
}
