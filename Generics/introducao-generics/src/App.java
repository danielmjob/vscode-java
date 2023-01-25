import java.util.Scanner;

import services.PrintService;

public class App {

    public static void main(String[] args) {

        /*
         * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
         * inteiros. Ao final, imprima esses números de forma organizada conforme
         * exemplo. Em seguida, informar qual foi o primeiro valor informado.
         */

        // Resolução Usando Generics<>
            //Benefícios
                // • Reuso
                // • Type safety
                // • Performance/


        System.out.println();
        Scanner sc = new Scanner(System.in);


        // Para mudar o tipo basta alterar onde estiver Integer para String por exexmplo sem que haja erros no codigo


        PrintService<Integer> ps = new PrintService<>();

        /*
         * Type safety
         * quando usada a parametrização nesse caso para Integer o programa não aceitará
         * nenhum tipo que não seja inteiro 
         */

        System.out.print("How many values? ");
        int num = sc.nextInt();

       // essa linha deixa de funcionar ps.addValue("Maria");

        for (int i = 0; i < num; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);
        sc.close();
    }
}
