import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        // EXERCICIOS SEÇAO 4 AULA 29

        /*
         * Exercício 06 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
         * Fazer um programa que leia três valores com ponto flutuante de dupla
         * precisão: A, B e C. Em seguida, calcule e mostre:
         * 
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * 
         * b) a área do círculo de raio C.(pi = 3.14159)
         * 
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * 
         * d) a área do quadrado que tem lado B.
         * 
         * e) a área do retângulo que tem lados A e B.
         * 
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite os valores de A B C");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // a) a área do triângulo retângulo que tem A por base e C por altura.

        double areaTri = (a * c) / 2;

        // b) a área do círculo de raio C.(pi = 3.14159) double areaCirc = Math.PI *
        double areaCirc = Math.PI * Math.pow(c, 2);

        // c) a área do trapézio que tem A e B por bases e C por altura. double
        double areaTrap = ((a + b) * c) / 2;

        // d) a área do quadrado que tem lado B. double areaQuad = b * b;
        double areaQuad = b * b;

        // e) a área do retângulo que tem lados A e B double areaRet = a * b;
        double areaRet = a * b;

        System.out.printf("TRIANGULO %.3f%n", areaTri);
        System.out.printf("CIRCULO %.3f%n", areaCirc);
        System.out.printf("TRAPÉZIO %.3f%n", areaTrap);
        System.out.printf("QUADRADO %.3f%n", areaQuad);
        System.out.printf("RETANGULO %.3f%n", areaRet);

        sc.close();

    }
}
