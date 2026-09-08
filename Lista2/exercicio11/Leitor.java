package Lista2.exercicio11;

import java.io.FileReader;
import java.io.IOException;

public class Leitor {
    public static void lerArquivo(String nomeArquivo) throws IOException{
        
        try (FileReader file = new FileReader(nomeArquivo)) {
            int data;
            while((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        } 
    }
}
