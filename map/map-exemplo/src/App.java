import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>(); // será ordenado por chave

        // adicionando elementos
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        // excluindo elementos
        cookies.remove("email");

        // adicionando elementos com chave igual (ou seja será sobescrito) não aceita
        // repetições
        cookies.put("phone", "99711133");

        // procurando uma chave dentro dos elementos
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        // pegando uma valor de uma chave
        System.out.println("Phone number: " + cookies.get("phone"));

        // pegando uma chave que não existe (foi apagada na linha 15)
        System.out.println("Email: " + cookies.get("email"));

        //numero de elementos
        System.out.println("Size: " + cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES:");

        // imprimir
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
