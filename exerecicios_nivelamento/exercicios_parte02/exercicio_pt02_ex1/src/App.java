import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 01 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é
         * negativo ou não
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
