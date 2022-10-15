import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 03 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
         * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
         * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
         * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
         * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
         * o terceiro valor tem peso 5.
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de médias que serão digitadas: ");
        int n = sc.nextInt();

        double media = 0;

        for (int i = 0; i < n; i++) {

            System.out.println();

            System.out.println("--- " + (i + 1) + "º ALUNO ---");
            System.out.print("PRIMEIRA NOTA: ");
            double nota1 = sc.nextDouble();
            System.out.print("SEGUNDA NOTA: ");
            double nota2 = sc.nextDouble();
            System.out.print("TERCEIRA NOTA: ");
            double nota3 = sc.nextDouble();

            media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

            System.out.println();

            System.out.printf("MÉDIA %.1f - ", media);

            if (media < 7) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("APROVADO");
            }

        }

        sc.close();
    }
}
