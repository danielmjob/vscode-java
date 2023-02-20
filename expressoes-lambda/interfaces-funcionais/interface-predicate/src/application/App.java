package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

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

        list.removeIf(new ProductPredicate());

        for (Product product : list) {
            System.out.println(product);
        }

    }

}
