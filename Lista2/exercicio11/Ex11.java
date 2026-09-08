package Lista2.exercicio11;

import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) {
        try {
            Leitor.lerArquivo("/Lista2/pantera.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
