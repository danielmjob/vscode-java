import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num, soma = 0;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while (num != 0) {
            soma += num;
            System.out.print("Digite um número: ");
            num = sc.nextInt();

        }

        System.out.print("Soma: " + soma);
        sc.close();
    }
}
