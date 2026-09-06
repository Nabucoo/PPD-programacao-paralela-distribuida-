package exercicio19;

public class Gato extends Animal{
    Gato() {
        System.out.println("Um gato!");
    }

    @Override 
    void emitirSom() {
        System.out.println("MIAU!");
    }
}
