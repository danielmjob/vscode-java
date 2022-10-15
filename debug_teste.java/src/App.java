import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Testanto debug:
         * 
         * coloquei um Toggle Break point na linha >>> double metroQuadrado =
         * sc.nextDouble();
         * 
         * (Run Toggle Break point ou ctrl + shift + b ou clicando no numero da linha)
         * 
         * Apartir dali será iniciado o modo debbug onde a perspectiva muda facilitando
         * a visualização.
         * 
         * Para passar os passo aperte a tecla F6
         * 
         * Ao terminar só clicar no icone no canto superior direto e mudar a perspectiva
         * de volta
         * 
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite a Metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();
    }
}
