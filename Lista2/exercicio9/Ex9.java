package Lista2.exercicio9;

public class Ex9 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            Integer.parseInt("abc");
            System.out.println(numeros[5]);
        } catch (NumberFormatException e) {
            System.err.println("Não foi possivel realizar a conversão para inteiro!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("índice fora do alcance!");
        }
    }
}
