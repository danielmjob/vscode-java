package application;

import java.io.File;
import java.util.Scanner;

public class AppFive {
    public static void main(String[] args) {
        System.out.println();

        try (Scanner sc = new Scanner(System.in)) {

            // Indicando o caminho

            System.out.println("Enter a folder: ");
            String strPath = sc.nextLine();

            File path = new File(strPath);

            System.out.println();
            // Gerando uma lista de PASTAS (folders) de acordo com o caminho escolhido

            File[] folders = path.listFiles(File::isDirectory);
            System.out.println("Folders: ");
            for (File folder : folders) {
                System.out.println(folder);
            }

            System.out.println();
            // Gerando uma lista de ARQUIVOS (files) de acordo com o caminho escolhido

            File[] files = path.listFiles(File::isFile);
            System.out.println("Files: ");
            for (File file : files) {
                System.out.println(file);
            }

            System.out.println();

            // Criando uma sub-pasta dentro do caminho selecionado

            boolean success = new File(strPath + "\\subdir").mkdir();
            // File(caminhoDaPasta + "\\nomeDaPasta").oQueDesejaFazer
            // Nesse caso usado o mkdir() = criar (make diretory)
            // IMPORTANTE: se a pasta ja existe ele retorna false

            

            System.out.println("Directiry created sucessfully: " + success);

            System.out.println();

            // Se foi criada uma pasta vai imprimir a lista de pastas novamente

            if (success){
                for (File folder : folders) {
                    System.out.println(folder);
                } 
            }

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());

        }

    }

}
