import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho da pasta: ");
        // String caminho = "c:\\temp\\in.txt";
        String caminho = sc.nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {

            // Lendo linha por linha e enumerando-as

            int numeroDaLinha = 1;

            String linha = bf.readLine();
            while (linha != null) {

                System.out.println(numeroDaLinha + " - " + linha);
                linha = bf.readLine();

                numeroDaLinha++;
            }

            System.out.println("Sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro: ");
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }

}
