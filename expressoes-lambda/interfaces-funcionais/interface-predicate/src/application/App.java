package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;


public class App {
    public static void main(String[] args) {

        /*
         * Fazer um programa que, a partir de uma lista de produtos,
         * remova da lista somente aqueles cujo preço mínimo seja 100.
         */

        System.out.println();
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.9));

        // usando expressão lambda inline (forma mais clean possivel)
                
        list.removeIf(p -> (p.getPrice() >= 100.0));

        for (Product product : list) {
            System.out.println(product);
        }

    }

}
