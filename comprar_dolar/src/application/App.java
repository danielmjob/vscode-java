package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do Dolar? ");
        double precoDolar = sc.nextDouble();

        System.out.print("Quantos dolares você quer comprar? ");
        double totalDolar = sc.nextDouble();

        double result = CurrencyConverter.calcularDolar(totalDolar, precoDolar);
        System.out.printf("Amount to be paid in reais =  %.2f%n", result);

        sc.close();
    }

  
}
