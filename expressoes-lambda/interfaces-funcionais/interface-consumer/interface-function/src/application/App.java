package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class App {
    public static void main(String[] args) {

        /*
         * Fazer um programa que, a partir de uma lista de produtos, gere uma
         * nova lista contendo os nomes dos produtos em caixa alta.
         */

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*
         * Função "map" (não confunda com a estrutura de dados Map) é uma
         * função que aplica uma função a todos elementos de uma stream
         */

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // função map só funciona em stream por isso converte para stream primeiro 
        // na função map ela aplica a cada valor da coleção a função que foi chamada, nesse caso UpperCaseName
        // depois converte novamente para lista

        names.forEach(System.out::println);
    }
}
