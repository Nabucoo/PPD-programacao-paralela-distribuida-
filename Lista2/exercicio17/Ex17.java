package Lista2.exercicio17;

public class Ex17 {
    public static void main(String[] args) {
        int [][][] matriz;

        matriz = new int[2][2][2];

        matriz[0][0][0] = 1;
        matriz[0][0][1] = 2;

        matriz[0][1][0] = 3;
        matriz[0][1][1] = 4;

        matriz[1][0][0] = 5;
        matriz[1][0][1] = 6;

        matriz[1][1][0] = 7;
        matriz[1][1][1] = 8;

        for (int i = 0; i < 2; i++) {
            for (int j =  0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.printf("arr[%d][%d][%d] = %d\n", i, j, k, matriz[i][j][k]);
                }
            }
        }
    }
}
