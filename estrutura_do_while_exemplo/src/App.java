import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Estrurura Do While - faça enquanto
         *
         * Essa forma o bloco de comandos sempre será executado ao menos uma vez
         */

        Scanner sc = new Scanner(System.in);

        char op = 'S';

        do {
            System.out.print("Digite a temperatura em Celcius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);

            System.out.print("Deseja fazer outra conversão [S/N]");
            op = sc.next().charAt(0);

        } while (op == 'S' || op == 's');

        System.out.print("Obrigado pela preferencia");

        sc.close();

    }
}
