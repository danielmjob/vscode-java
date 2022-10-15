import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 01 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
         * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
         * até X, um valor por linha, inclusive o X, se for o caso.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            } else {
                // reservado para números pares
            }

        }

        sc.close();
    }
}
