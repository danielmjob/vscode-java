import java.util.Scanner;

import services.PrintServiceString;

public class App {

    public static void main(String[] args) {

        /*
         * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
         * inteiros. Ao final, imprima esses números de forma organizada conforme
         * exemplo. Em seguida, informar qual foi o primeiro valor informado.
         */

         //Resolução para Inteiros e String

        System.out.println();
        Scanner sc = new Scanner(System.in);

        PrintServiceString ps = new PrintServiceString();

        System.out.print("How many values? ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());
        sc.close();
    }
}
