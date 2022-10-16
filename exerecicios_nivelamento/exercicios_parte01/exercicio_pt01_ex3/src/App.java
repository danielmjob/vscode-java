import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // EXERCICIOS SEÇAO 4 AULA 29

        /*
         * Exercício 03 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
         * calcule e mostre a diferença do produto de A e B pelo produto de C e D
         * segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Entrada");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = ((a * b) - (c * d));

        System.out.println("Saida " + diferenca);

        sc.close();
    }
}
