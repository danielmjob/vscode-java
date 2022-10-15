import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Como funcionam as expressões ternárias
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double descontoTernario = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println("Usando EXPRESSÃO TERNÁRIA");
        System.out.println(descontoTernario);

        // Esse código acima é o mesmo que digitar esse código aqui abaixo

        preco = 34.5;
        double descontoIf;

        if (preco < 20.0) {
            descontoIf = preco * 0.1;
        } else {
            descontoIf = preco * 0.05;
        }
        System.out.println("Usando IF");
        System.out.println(descontoIf);

        // forma de expressão ternária economiza tempo e linhas de código

        sc.close();
    }
}
