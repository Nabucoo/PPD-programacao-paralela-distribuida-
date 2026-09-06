package exercicio19;

public class Vaca extends Animal{
    Vaca() {
        System.out.println("Uma vaca!");
    }

    @Override 
    void emitirSom() {
        System.out.println("MUUUUUU!");
    }
}
