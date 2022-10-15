import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 02 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java
         * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
         * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
         * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
         * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
         * "out" para fora do intervalo).
         */

        Scanner sc = new Scanner(System.in);

        int valorDentro = 0;
        int valorFora = 0;

        System.out.print("Quantos números deseja digitar? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                valorDentro += 1;
            } else {
                valorFora += 1;
            }
        }

        System.out.println("In: " + valorDentro);
        System.out.println("Out: " + valorFora);
        sc.close();
    }
}
