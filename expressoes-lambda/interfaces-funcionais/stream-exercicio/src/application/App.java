package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) {

        /*
         * Fazer um programa para ler um conjunto de produtos a partir de um
         * arquivo em formato .csv (suponha que exista pelo menos um produto).
         * Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
         * nomes, em ordem decrescente, dos produtos que possuem preço
         * inferior ao preço médio.
         * 
         * 
         * Input file
         * 
         * Tv,900.00
         * Mouse,50.00
         * Tablet,350.50
         * HD Case,80.90
         * Computer,850.00
         * Monitor,290.00
         * 
         * 
         * Execution
         * 
         * Enter full file path: c:\temp\in.txt
         * Average price: 420.23
         * Tablet
         * Mouse
         * Monitor
         * HD Case
         */

        System.out.println();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] campos = line.split(",");
                list.add(new Product(campos[0], Double.parseDouble(campos[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice()) // pega os preços dos produtos
                    .reduce(0.0, (x, y) -> x + y) / list.size(); // faz a media entre os preços dos produtos

            System.out.println("Media de preços " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); // gera um comparador em
                                                                                                // ordem crescente
                                                                                                
            List<String> names = list.stream() // gera uma stream
                    .filter(p -> p.getPrice() < avg) // filtra os produtos com preço menor que a media
                    .map(p -> p.getName()) // pega apenas os nomes
                    .sorted(comp.reversed()) // faz com que a lista que estava crescente vire decrescente
                    .collect(Collectors.toList()); // transforma de stream para list

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
