package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws ParseException {

        /*
         * Fazer um programa para ler o caminho de um arquivo .csv
         * contendo os dados de itens vendidos. Cada item possui um
         * nome, preço unitário e quantidade, separados por vírgula. Você
         * deve gerar um novo arquivo chamado "summary.csv", localizado
         * em uma subpasta chamada "out" a partir da pasta original do
         * arquivo de origem, contendo apenas o nome e o valor total para
         * aquele item (preço unitário multiplicado pela quantidade),
         * conforme exemplo
         * 
         * 
         * Source File
         * 
         * TV LED,1290.99,1
         * Video Game Chair,350.50,3
         * Iphone X,900.00,2
         * Samsung Galaxy 9,850.00,2
         * 
         * 
         * Output file (out/summary.csv):
         * 
         * TV LED,1290.99
         * Video Game Chair,1051.50
         * Iphone X,1800.00
         * Samsung Galaxy 9,1700.00
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent(); // Pegando caminho sem nome do arquivo

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); // Criando pasta

        // System.out.println("Folder created: " + success); // Testando se a pasta foi
        // criada

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // caminho da pasta e nome do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine(); // ler linha por linha
            while (itemCsv != null) {

                String[] fields = itemCsv.split(","); // Separa os dados que estão separados por virgula
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine(); // proxima linha
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                // Percorrer lista
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine(); // para quebrar linha
                }

                System.out.println(targetFileStr + " CREATED");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());

        }

        sc.close();

    }
}
