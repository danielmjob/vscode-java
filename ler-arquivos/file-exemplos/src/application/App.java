package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // lendo um arquivo no caminho C:\temp
        System.out.println();

        File file = new File("c:\\temp\\in.txt"); // sempre usar duas barras para barra invertida
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) { // se existir uma linha ler a proxima
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        String nome = file.getName(); // acessando nome do arquivo

        System.out.println(nome);
    }

}
