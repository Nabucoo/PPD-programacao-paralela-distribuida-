package Lista2.exercicio4;

public class CalculadoraArea {

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularArea(double raio, boolean isCirculo) {
        if (isCirculo) {
            return Math.PI * raio * raio;
        } else {
            return calcularArea(raio);
        }
        
    }
}
