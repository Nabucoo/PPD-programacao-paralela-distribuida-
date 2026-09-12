package exercicio4;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[4000][4000];

        long inicio = System.currentTimeMillis();

        for (int i=0; i < 4000; i++) {
            for (int j=0; j < 4000; j++) {
                matriz[i][j] = 10;
                matriz[i][j] *= 2;
            }
        };

        long fim = System.currentTimeMillis();



        System.out.println(matriz[39][43]);
        System.out.println(matriz[3098][23]);
        System.out.println(matriz[344][498]);

        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
