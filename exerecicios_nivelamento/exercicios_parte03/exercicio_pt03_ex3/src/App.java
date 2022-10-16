import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 03 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java Um
         * Posto de combustíveis deseja determinar qual de seus produtos tem a
         * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
         * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
         * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
         * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
         * será encerrado quando o código informado for o número 4. Deve ser escrito a
         * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
         * tipo de combustível, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int totalClientes = 0;

        System.out.println("[1] ÁLCOOL ");
        System.out.println("[2] GASOLINA ");
        System.out.println("[3] DIESEL ");
        System.out.println("[4] FIM ");

        System.out.println("Digite a opão desejada: ");
        opcao = sc.nextInt();

        while (opcao != 4) {

            if (opcao == 1) {
                alcool = alcool + 1;
            } else if (opcao == 2) {
                gasolina = gasolina + 1;
            } else if (opcao == 3) {
                diesel = diesel + 1;
            } else if (opcao < 1 || opcao > 4) {
                System.out.println("--- Opção " + opcao + " é invalida ---");
            }

            System.out.println("[1] ÁLCOOL ");
            System.out.println("[2] GASOLINA ");
            System.out.println("[3] DIESEL ");
            System.out.println("[4] FIM ");

            System.out.println("Digite a opão desejada: ");
            opcao = sc.nextInt();
        }

        totalClientes = alcool + gasolina + diesel;

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("Total de clientes: " + totalClientes);

        sc.close();
    }
}
