
import java.util.LinkedHashSet;
import java.util.Set;

public class AppOperacoes {
    public static void main(String[] args) {

        System.out.println();

        Set<String> set = new LinkedHashSet<>();

        set.add("JOAO");
        set.add("PEDRO");
        set.add("PAULA");
        set.add("MARIA");
        set.add("JOAQUIM");
        set.add("DANIEL");
        set.add("BRUNA");
        set.add("ANDRE");
        set.add("ALEX");
        set.add("CAMILA");
        set.add("SEBASTIÃO");


        imprimir(set); // imprime os elementos do conjunto

        // procura se existe o elemento DANIEL, ele é Case Sensitive
        System.out.println("Elemento DANIEL no conjunto? " + set.contains("DANIEL"));
        
        System.out.println();

        System.out.println("Removendo elemento JOAQUIM do conjunto");
        set.remove("JOAQUIM");

        imprimir(set); // imprime os elementos do conjunto

        System.out.println();

        System.out.println("removeIf: para todos que tiverem nomes com mais de 7 LETRAS ");

        set.removeIf(x -> x.length() >= 7);
        // remover se encontrar  o x tal que tamanho do elemento x seja >= 7

        imprimir(set);

        System.out.println("removeIf: para todos que comecem com a letra P");

        set.removeIf(x-> x.charAt(0) == 'P'); // remove elementos que comecem com a letra P

        imprimir(set);

    }



    public static void imprimir(Set<String> set) {
        System.out.println();

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();
    }
}
