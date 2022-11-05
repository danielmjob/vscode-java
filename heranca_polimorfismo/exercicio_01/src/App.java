
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdfDMY = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listProducts = new ArrayList<>();   

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++){
            System.out.println("Product #" + (i + 1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            // Usei o switch case porém havia a possibilidade de usar o if também

            switch (op) {
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    listProducts.add(new ImportedProduct(name, price, customsFee));
                break;

                case 'c':
                    listProducts.add(new Product(name, price));
                break;    

                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    Date manufacturedDate = sdfDMY.parse(sc.next());
                    listProducts.add(new UsedProduct(name, price, manufacturedDate));
                break;       

            }
        }
        
        System.out.println();
        System.out.println("PRICE TAGS:");
        System.out.println();

        for (Product seeProduct : listProducts) {
            System.out.println(seeProduct.priceTag());
        }
        
        sc.close();
    }
}
