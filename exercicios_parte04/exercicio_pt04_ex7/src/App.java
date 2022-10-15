import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 07 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
         * 
         * Fazer um programa para ler um número inteiro positivo N. O programa deve
         * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
         * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
         * exemplo.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número");
        int num = sc.nextInt();

        int pot = 3; // valor maximo da potencia baseado no enunciado

        int resultado = 1;

        for (int i = 1; i <= num; i++) {

            // primeiro "for" para definir o número de linhas

            for (int j = 1; j <= pot; j++) { // caso queira aumentar a potenciação altere a variavel "pot"
                // segundo "for" é feito a potenciação
                resultado = (int) Math.pow(i, j);

                System.out.print(resultado + " ");
            }
            System.out.println();
        }

        /*
         * No curso foi feito da forma abaixo porém fica pouco pratico, para o caso de
         * querer aumentar a pontenciação para além de ao cubo teria de modificar o
         * código
         */

        int n = sc.nextInt();

        for (int i2 = 1; i2 <= n; i2++) {

            int primeiro = i2;
            int segundo = i2 * i2;
            int terceiro = i2 * i2 * i2;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

            sc.close();
        }
    }
}
