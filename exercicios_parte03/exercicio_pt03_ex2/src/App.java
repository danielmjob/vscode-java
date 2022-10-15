import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 02 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
         * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
         * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
         * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
         * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
         * alguma).
         */

        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Digite o valor de X: ");
        x = sc.nextDouble();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q2");
            }

            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();

            System.out.print("Digite o valor de Y: ");
            y = sc.nextDouble();
        }

        System.out.println("Fim da execução...");
        sc.close();
    }
}
