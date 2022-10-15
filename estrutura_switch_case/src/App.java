import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Estrurua Switch Case
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número da semana: ");
        int numSemana = sc.nextInt();

        switch (numSemana) {
            case 1:
                System.out.println("Dia da semana DOMINGO");
                break;
            case 2:
                System.out.println("Dia da semana SEGUNDA");
                break;
            case 3:
                System.out.println("Dia da semana TERÇA");
                break;
            case 4:
                System.out.println("Dia da semana QUARTA");
                break;
            case 5:
                System.out.println("Dia da semana QUINTA");
                break;
            case 6:
                System.out.println("Dia da semana SEXTA");
                break;
            case 7:
                System.out.println("Dia da semana SÁBADO");
                break;
            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }

        sc.close();
    }
}
