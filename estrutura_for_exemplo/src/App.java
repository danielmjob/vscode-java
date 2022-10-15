import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int soma = 0;

        /*
         * Estrurura for
         *
         * for (inicio a variavel ; defino a condição; adiciono o incremento/decremento)
         * {bloco de comandos}
         */

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int x = sc.nextInt();
            soma += x; // o mesmo que digitar soma = soma + x;
        }

        System.out.println("Total: " + soma);

        sc.close();
    }
}
