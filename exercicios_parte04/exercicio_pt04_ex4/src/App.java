import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 04 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
         * Fazer um programa para ler um número N. Depois leia N pares de números e
         * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
         * mostrar a mensagem "divisao impossivel".
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de entradas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o dividendo: ");
            int dividendo = sc.nextInt();
            System.out.print("Digite o denominador: ");
            int denominador = sc.nextInt();

            if (denominador != 0) {
                // tive que fazer o cast pois o resultado sem ele perdia os valores após o ponto
                double quociente = (double) dividendo / denominador;
                System.out.printf("RESULTADO %.1f%n", quociente);

            } else {
                System.out.println("Divisão impossível");
            }

        }

        sc.close();
    }
}
