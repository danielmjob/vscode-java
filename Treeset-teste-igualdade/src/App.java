import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Product> set = new TreeSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        // Para funcionar precisa que seja feita uma implemetação do comparable na classe Product
        

        for (Product p : set) {
            System.out.println(p);
        }
    }


}