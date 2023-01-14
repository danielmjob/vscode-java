package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppFour {

    public static void main(String[] args) {
        // Criando arquivos

        String[] lines = new String[] { "Good morning", "Good afternoon", "Good nigth" };

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { 
            // Sempre cria um novo arquivo. 
            // Para escrever dando continuidade acrescente o ,new assim new FileWriter(path,new)
            for (String line : lines) {
                bw.write(line);
                bw.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
