package exercicio19;

public class Cachorro extends Animal {
    Cachorro() {
        System.out.println("Um cachorro!");
    }

    @Override 
    void emitirSom() {
        System.out.println("AU AU!");
    }
}
