package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            Retangulo retang = new Retangulo();

            System.out.println("-------- ---------");         
            System.out.println("Cálculos Retângulo");
            System.out.println("-------- ---------");
            
            System.out.print("Digite o valor da BASE do retângulo: ");
            retang.base = sc.nextDouble();

            System.out.print("Digite o valor da ALTURA do retângulo: ");
            retang.altura = sc.nextDouble();

            double areaRetang = retang.calcularArea();
            double periRetang = retang.calcularPerimetro();
            double diagRetang = retang.calcularDiagonal();

            System.out.println();
            System.out.printf("AREA: %.2f%n",areaRetang);
            System.out.printf("PERIMETRO: %.2f%n",periRetang);
            System.out.printf("DIAGONAL:  %.2f%n",diagRetang);

        sc.close();
    }
}
