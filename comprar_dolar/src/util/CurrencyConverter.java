package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calcularDolar(double totalDolar, double precoDolar){
        double valorFinalReal = (totalDolar * precoDolar);
        return valorFinalReal += valorFinalReal*IOF;
    }
    
}
