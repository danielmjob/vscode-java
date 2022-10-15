import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Exercício 01 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
         * Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
         * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
         * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
         * correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha de 4 dígitos: ");
        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha Invalida");

            System.out.println("Digite a senha de 4 dígitos: ");
            senha = sc.nextInt();

        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
