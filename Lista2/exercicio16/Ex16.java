package Lista2.exercicio16;

public class Ex16 {
    public static void main(String[] args) {
        int [][] matriz;

        matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        int soma = 0;
        int indiceI = 0;
        int indiceJ = 0;

        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j + " ");
                if (indiceI == indiceJ) {
                    soma += matriz[indiceI][indiceJ];
                } 
                indiceJ++;
            }
            System.out.print("\n");
            indiceJ = 0;
            indiceI++;
        }

        System.out.println("Soma da diagonal principal: " + soma);
        

    }
}
