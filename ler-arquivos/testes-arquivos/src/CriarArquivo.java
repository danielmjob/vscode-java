import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArquivo {

    public static void main(String[] args) {

        System.out.println();

        Scanner sc = new Scanner(System.in);
        String caminho = "C:\\temp\\teste\\criadoViaJava.txt";

        System.out.print("Quantas linhas deseja digitar? ");
        int numeroDeLinhas = sc.nextInt();

        String[] linhas = new String[numeroDeLinhas];
        sc.nextLine();

        for (int i = 0; i < numeroDeLinhas; i++) {
            linhas[i] = sc.nextLine();
        }


        /*
         * 
         * System.out.println();
         * System.out.println("Lendo linhas...");
         * System.out.println();
         * 
         * for (String linhas : linha) {
         * System.out.println(linhas);
         * }
         * 
         */



        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {

            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
                
            }


           

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {

            sc.close();
        }

    }

}
