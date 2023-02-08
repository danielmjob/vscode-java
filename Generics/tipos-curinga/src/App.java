import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        System.out.println();

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);

    }

    public static void printList(List<?> list) {
        /*
         * <?> é o tipo curinga para listas, OU SEJA, ele recebe qualquer tipo de lista
         * porém não se pode adicionar pois o compilador não sabe qual tipo especifico a lista foi instanciada
         * ex.: list.add(3) >>>> apresentará erro de compilação
         */
        
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
