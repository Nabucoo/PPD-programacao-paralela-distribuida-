package Lista2.exercicio10;

public class Ex10 {

    public static void validarIdade(int idade) throws IllegalArgumentException {
        if (idade < 18) {
            throw new IllegalArgumentException("Acesso negado: idade minima e 18 anos");
        }
    }
    public static void main(String[] args) {
        try {
            Ex10.validarIdade(19);
            System.out.println("Acesso permitido!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
