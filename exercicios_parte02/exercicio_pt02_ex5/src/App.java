import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 05 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
         * 
         * Com base na tabela abaixo, escreva um programa que leia o código de um item e
         * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int cod = sc.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int quant = sc.nextInt();

        String item = null;
        double valorAPagar = 0;

        /*
         * Esse exercício foi feito usando o if apenas para treino da estruruta poderia
         * facilmente ser usado o Case, inclusive ficaria até mais simples.
         * 
         * Aproveitei e fiz algumas breves modificações do exercicio original.
         */

        if (cod == 1) {
            item = "CACHORRO QUENTE";
            valorAPagar = quant * 4.00;
        } else if (cod == 2) {
            item = "X-SALADA";
            valorAPagar = quant * 4.50;
        } else if (cod == 3) {
            item = "X-BACON";
            valorAPagar = quant * 5.00;
        } else if (cod == 4) {
            item = "TORRADA";
            valorAPagar = quant * 2.00;
        } else if (cod == 5) {
            item = "REFRIGERANTE";
            valorAPagar = quant * 1.50;
        }

        System.out.printf("%s %s(S) - Total:R$ %.2f%n", quant, item, valorAPagar);
        sc.close();

    }
}
