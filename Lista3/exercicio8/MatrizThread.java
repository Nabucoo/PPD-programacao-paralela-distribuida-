package exercicio8;

public class MatrizThread extends Thread {
    private int inicio;
    private int fim;
    public static int[][] matriz;
    
    static {
        matriz = new int[4000][4000];

        for (int i = 0; i <= 3999; i++) {
            for(int j = 0; j <= 3999; j++) {
                matriz[i][j] = 10;
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
                for (int j = 0; j <= 3999; j++) {
                    matriz[i][j] *= 2;
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrompida!");
        }
    }
}
