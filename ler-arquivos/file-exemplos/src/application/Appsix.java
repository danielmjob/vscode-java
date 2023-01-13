package application;

import java.io.File;
import java.util.Scanner;

public class Appsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // pega o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // pega o caminho SEM nome do arquivo
        System.out.println("getParent: " + path.getPath()); // pega o caminho COM nome do arquivo

        sc.close();

    }

}
