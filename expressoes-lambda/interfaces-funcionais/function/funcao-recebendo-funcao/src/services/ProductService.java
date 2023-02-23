package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria){ // criando um criterio para teste
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)){ //criando um teste generico de qualquer predicado que for recebido no paramentro
                sum+= p.getPrice();
            }
        }
        return sum;
    }
}
