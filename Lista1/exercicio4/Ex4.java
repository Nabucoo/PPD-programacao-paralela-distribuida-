package exercicio4;

public class Ex4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Inteiros: ");

        System.out.println("Soma");
        System.out.println(a + " + " + b + " = " + CalcInt.soma(a, b));

        System.out.println("Subtração");
        System.out.println(a + " - " + b + " = " + CalcInt.subtracao(a, b));

        System.out.println("Multiplicação");
        System.out.println(a + " * " + b + " = " + CalcInt.multiplicacao(a, b));

        System.out.println("Divisão");
        System.out.println(a + " / " + b + " = " + CalcInt.divisao(a, b));

        System.out.println("Resto");
        System.out.println(a + " % " + b + " = " + CalcInt.resto(a, b));

        double x = 10.5;
        double y = 2.0;

        System.out.println("\nDoubles: ");

        System.out.println("Soma");
        System.out.println(x + " + " + y + " = " + CalcDouble.soma(x, y));

        System.out.println("Subtração");
        System.out.println(x + " - " + y + " = " + CalcDouble.subtracao(x, y));

        System.out.println("Multiplicação");
        System.out.println(x + " * " + y + " = " + CalcDouble.multiplicacao(x, y));

        System.out.println("Divisão");
        System.out.println(x + " / " + y + " = " + CalcDouble.divisao(x, y));

        System.out.println("Resto");
        System.out.println(x + " % " + y + " = " + CalcDouble.resto(x, y));
  
    }
}
