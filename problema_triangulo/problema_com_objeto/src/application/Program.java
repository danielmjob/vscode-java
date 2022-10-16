package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();


        System.out.printf("Área do triangulo X: %.4f%n", areaX);
        System.out.printf("Área do triangulo Y: %.4f%n", areaY);


        if (areaX > areaY){
            System.out.print("O Triângulo X tem a maior área");
        }else{
            System.out.print("O Triângulo Y tem a maior área");
        }

        sc.close();

    }
}
