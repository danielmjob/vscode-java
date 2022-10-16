package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter product data: ");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        /*
         * Criando teste provisório
         * System.out.println(product.name+", "+product.price+", "+product.quantity);
        */

        System.out.println();
        System.out.println("Product data: " + product.toString());
        
// Atualizando os dados do produto
        
    //Adicionando itens
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();      
        product.addProducts(quantity);
        System.out.println("Update data: " + product.toString());


    // Removendo itens

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity =  sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product.toString());

     
        sc.close();
    }
    
}
