package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppThree {

    public static void main(String[] args) {

        // Mesmo exemplo do AppTwo, porem usando o Bloco Try-with-resources
        // Eliminando muitas linhas de código

        System.out.println();

        String path = "c:\\temp\\in.txt";
            // Se quiser testar o bloco "try/cath" só mudar o nome ou caminho do arquivo acima

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
           
            String line = br.readLine(); // LÊ uma linha , SE a linha estiver VAZIA retorna NULL.

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        } 
    }

}

