package Lista2.exercicio8;

public class Ex8 {
    public static void main(String[] args) {
        int a = 20;
        int b = 2;

        try {
            int c = a / b;
            System.out.println("Answer: " + c);
        } catch (ArithmeticException e) {
            System.err.println("Não há divisão por zero!");
        } finally {
            System.out.println("Operação terminada!");
        }
    }
}
