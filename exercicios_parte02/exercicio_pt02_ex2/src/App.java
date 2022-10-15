import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 02 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou
         * ímpar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("NÚMERO PAR");
        } else {
            System.out.println("NÚMERO ÍMPAR");
        }

        sc.close();

    }
}
