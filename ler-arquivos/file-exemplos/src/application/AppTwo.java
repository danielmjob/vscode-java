package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppTwo {

    public static void main(String[] args) {

        System.out.println();

        // Modo não tão confortavel (método manual)
            // para funcionar voce precisa de um arquivo no C:\temp
                // nome in.txt

        String path = "c:\\temp\\in.txt";
            // Se quiser testar o bloco "try/cath" só mudar o nome ou caminho do arquivo acima

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path); // pega o caminho do arquivo
            br = new BufferedReader(fr); // BufferedReader é instanciado apartir do FileReader - tornando mais rapido

            /*
             * Outra forma de escrever
             * 
             * br = new BufferedReader(new FileReader(path));
             * 
             * porém nesse exemplo foi mantido a primeira forma devido ao uso das variáves
             * mais a frente no código
             */

            String line = br.readLine(); // LÊ uma linha , SE a linha estiver VAZIA retorna NULL.

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {

                e.printStackTrace(); // mostra onde foi o rastro na pilha

            }

        }

    }
}
