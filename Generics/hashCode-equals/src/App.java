import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println();

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b)); // funciona 100% porem pode ser demorado para executar

        System.out.println();

        String c = "Maria";
        String d = "Alex";
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println();

        Client c1 = new entities.Client("Maria", "maria@gmail.com");
        Client c2 = new entities.Client("Alex", "alex@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());   // gera um codigo
        System.out.println(c2.hashCode());   // gera um codigo
        System.out.println(c1.equals(c2));   // compara um codigo com o outro (compara pelo conteudo)
        System.out.println(c1 == c2);        // compara as referencias de memória
        System.out.println(s1 == s2);        // para Strings o tratamento é diferente (casos literais)
    }
}
