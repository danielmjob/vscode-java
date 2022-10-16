import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 06 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
         * 
         * Ler um número inteiro N e calcular todos os seus divisores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // iniciei com 1 senão haveria divisão por 0 resultando erro

            if (n % i == 0) {
                System.out.println(i);
            } else {
                // para os que não são divisores
            }

        }

        sc.close();
    }
}
