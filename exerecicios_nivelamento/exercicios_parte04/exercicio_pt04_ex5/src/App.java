import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 05 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
         * 
         * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
         * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
         * de 0 é 1.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja ver o fatorial de qual número? ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = n; i > 1; i--) {

            fatorial = fatorial * i;
        }

        System.out.print(fatorial);

        sc.close();

    }
}
