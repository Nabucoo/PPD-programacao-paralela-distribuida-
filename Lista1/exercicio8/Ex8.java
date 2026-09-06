package exercicio8;

public class Ex8 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma");
        System.out.println(calculadora.somar(2, 2));

        System.out.println("Subtração");
        System.out.println(calculadora.subtrair(4, 2));

        System.out.println("Multiplicação");
        System.out.println(calculadora.multiplicar(3, 4));

        System.out.println("Divisão");
        System.out.println(calculadora.dividir(10, 2));
    }
}
