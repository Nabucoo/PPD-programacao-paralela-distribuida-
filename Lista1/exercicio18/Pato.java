package exercicio18;

public class Pato implements Nadador, Voador{

    Pato() {
        System.out.println("Um pato!");
    }

    public void nadar() {
        System.out.println("Pato nadando!");
    }

    public void voar() {
        System.out.println("Pato voando!");
    }

}
