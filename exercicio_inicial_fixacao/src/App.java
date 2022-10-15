import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        String product1 = "Computer"; //String entre aspas duplas
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F'; //char sempre entre aspas simples
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		/* 
		 * Escrever a seguinte mensagem
		 * 
		 * Products:
		 *Computer, which price is $ 2100,00
		 *Office desk, which price is $ 650,50
		 *Record: 30 years old, code 5290 and gender: F
		 *Measue with eight decimal places: 53,23456700
		 *Rouded (three decimal places): 53,235
		 *US decimal point: 53.235
		*/
		
		
		/*
		 * %s - texto |String, char
		 * %f - ponto flutuante |2.0 3.550 etc
		 * %d - inteiro |inteiro serja positivo ou negativo
		 * %n - pular linha, quebrar linha
	    */
		
		
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n",product1, price1);
		System.out.printf("%s, which price is $ %.2f%n",product2, price2);
		System.out.printf("Record: %d years old, code %s and gender: %s%n",age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n",measure); // oito casas decimais
		System.out.printf("Rouded (three decimal places): %.3f%n",measure); // tres casas decimais

		Locale.setDefault(Locale.US); 		//altereção para ponto americano
		System.out.printf("US decimal point: %.3f%n",measure);
		
		//CASTING
		
		
		int x, y; 
		x = 2;
		y = 5;
		double resultado;
		
//Problema 1 Perca de dados	
		resultado = y/x;
		
		System.out.println(resultado); //o resultado em vez de apresentar 2.5 será 2.0 havendo perca de dados
		
	//Resolvendo o problema
		resultado = (double) y/x;
		System.out.println(resultado);
		
//Problema 2 Perca de dados
		
		double a;
		int b;
		a = 5.0;
		b = (int) a; 		// Estava escrito assim | b = a; a propria IDE apresenta um erro pois pode haver uma perca de dados
		System.out.println(b);

    }
}
