import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Digite a hora: ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");

        } else if (hora >= 12 && hora < 18) { // se a hora for maior igual 12 e menor que 18
            System.out.println("Boa tarde");

        } else {
            System.out.println("Boa noite");

        }

        sc.close();
    }
}
