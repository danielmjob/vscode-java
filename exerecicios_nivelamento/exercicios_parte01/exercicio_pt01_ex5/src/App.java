import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EXERCICIOS SEÇAO 4 AULA 29

        /*
         * Exercício 05 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
         * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valorUnitPeca1, valorFinalPeca1, valorUnitPeca2, valorFinalPeca2, soma;

        System.out.print("Digite os dados da primeira peça: ");

        codPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorUnitPeca1 = sc.nextDouble();

        valorFinalPeca1 = numPeca1 * valorUnitPeca1;

        System.out.print("Digite os dados da segunda peça: ");

        codPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUnitPeca2 = sc.nextDouble();

        valorFinalPeca2 = numPeca2 * valorUnitPeca2;

        soma = valorFinalPeca1 + valorFinalPeca2;

        System.out.println("Codigo do peça 01 " + codPeca1);
        System.out.println("Codigo do peça 02 " + codPeca2);

        System.out.printf("Valor final a pagar: R$ %.2f%n", soma);

        sc.close();
    }
}