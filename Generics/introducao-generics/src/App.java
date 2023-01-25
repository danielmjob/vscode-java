import java.util.Scanner;

import services.PrintService;

public class App {

    public static void main(String[] args) {

        /*
         * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
         * inteiros. Ao final, imprima esses números de forma organizada conforme
         * exemplo. Em seguida, informar qual foi o primeiro valor informado.
         */

         //Resolução para Inteiros e String (usando Object) >>>não funcional<<<

        System.out.println();
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int num = sc.nextInt();

        ps.addValue("Maria"); // Para teste misturando String com Integer

        for (int i = 0; i < num; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);
        sc.close();
    }
}
