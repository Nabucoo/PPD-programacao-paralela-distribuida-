package Lista2.exercicio13;

import java.io.FileReader;
import java.io.IOException;

public class Leitor {
    public static void lerArquivo(String nomeArquivo){
        
        try (FileReader file = new FileReader(nomeArquivo)) {
            int data;
            while((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        // exemplo de exceção verificada, que deve ser tratada em tempo de compilação
        } catch (IOException e) {
            System.out.println(e.getMessage());
        // exemplo de excecao não verificada.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
