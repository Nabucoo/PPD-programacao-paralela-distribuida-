package exercicio5;

public class SumThread extends Thread {
    //preciso passar como parametro o vetor, inicio e fim
    //dentro do run deve ter o loop
    //deve ter um método pra retornar a soma da thread

    private long[] numeros;
    private int inicio;
    private int fim;
    private long somaParcial;

    public SumThread(long[] numeros, int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.numeros = numeros;
    }

    @Override 
    public void run() {
        try {
            for (int i = this.inicio; i < this.fim; i++) {
            this.numeros[i] = 1;
            this.somaParcial += this.numeros[i];
        }} catch (Exception e) {
            System.out.println("Thread Interrompida!");
        }
    }

    public long getSomaParcial() {
        return somaParcial;
    } 
}
