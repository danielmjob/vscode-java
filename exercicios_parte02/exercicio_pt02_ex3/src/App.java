import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 03 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
         * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
         * crescente ou decrescente.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        // Regras aplicadas

        if (num1 > num2) { // primeiro testo quem é o maior

            if (num1 % num2 == 0) { // sendo o primeiro maior divido o primeiro pelo segundo e vejo se o resto é
                                    // zero
                System.out.println("São Múltiplos"); // sendo o resto zero entendo que um é multiplo do outro
            } else {
                System.out.println("NÃO são Múltiplos"); // sendo o resto difetente de zero quer dizer que o números não
                                                         // são múltiplos
            }
        } else {
            if (num2 % num1 == 0) { // no caso do segundo número ser o maior eu inverto a divisão ( segundo /
                                    // primeiro)
                System.out.println("São Múltiplos"); // sendo o resto zero entendo que um é multiplo do outro
            } else {
                System.out.println("NÃO são Múltiplos"); // sendo o resto zero entendo que um é multiplo do outro
            }

        }

        sc.close();
    }
}
