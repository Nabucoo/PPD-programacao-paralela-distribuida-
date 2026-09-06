package exercicio12;

public class Circulo extends Forma {

    public double calcularArea(double r) {
        this.area = Math.PI * (r * r);
        return area;
    }
}
