import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Representa um conjunto de elementos (similar ao da Álgebra)
         * 
         * HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
         * 
         * TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
         * pelo compareTo do objeto (ou Comparator)
         * 
         * LinkedHashSet - velocidade intermediária e elementos na ordem em que são
         * adicionados
         * 
         */
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("HashSet");
        Set<String> set = new HashSet<>();
        // cria um "conjunto" usando a implemetação hash
        // HashSet é o mais rapido mas não garante a ordem

        // adiciona elementos ao conjunto
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook")); // testa se existe o elemento Notebook

        System.out.println();

        // imprime os elementos do conjunto
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("TreeSet");
        Set<String> set2 = new TreeSet<>();
        // cria um "conjunto" usando a implemetação TreeSet
        // TreeSet é o mais lento mas ordena em ordem alfabética

        set2.add("Tv");
        set2.add("Tablet");
        set2.add("Notebook");

        System.out.println(set2.contains("Notebook"));

        System.out.println();

        for (String p2 : set2) {
            System.out.println(p2);
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("LinkedHashSet");
        Set<String> set3 = new LinkedHashSet<>();
        // cria um "conjunto" usando a implemetação LinkedHashSet
        // LinkedHashSet é o intermédiário a ordem dos elementos é dada pela ordem de
        // inserção

        set3.add("Tv");
        set3.add("Tablet");
        set3.add("Notebook");

        System.out.println(set3.contains("Notebook"));

        System.out.println();

        for (String p3 : set3) {
            System.out.println(p3);
        }

    }

    
}
