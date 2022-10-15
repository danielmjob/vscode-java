import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // EXERCICIOS SEÇAO 4 AULA 29

        /*
         * Exercício 01 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
         * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
         * soma desses números com uma mensagem explicativa, conforme exemplos.
         */

        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite um número: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
