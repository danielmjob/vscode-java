package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quadrado;
import entities.Retangulo;
import entities.Circulo;


  /*
         * ESSE PROGRAMA TEM O INTUITO DE TREINAR O CONHECIMENTO EM OBJETOS (ATRIBUTOS E METODOS)
         * ESTRUTURA DO WHILE E SWITCH CASE POR ISSO FIZ APENAS COM ALGUMAS FIGURAS.
         * ESSE CODIGO AINDA PODE SER REFATORADO (MELHORADO) COM O TEMPO
         * 
        */


public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opFigura;
        char opContinuar;

 do{
        System.out.println("Escolha qual figura deseja calcular");

        System.out.println("[1] QUADRADO");
        System.out.println("[2] RETÂNGULO");
        System.out.println("[3] CÍRCULO");

        opFigura = sc.nextInt();

        switch (opFigura){
        case 1 :
                //Quadrado
                System.out.println();

                Quadrado x = new Quadrado();
                System.out.println("<< QUADRADO >>");
                
                System.out.print("Digite o valor da BASE: ");
                x.baseQuadrado = sc.nextDouble();
 
                double areaDoQuadrado = x.calculoAreaQuadrado();
                double perimetroDoQuadrado = x.calculoPerimetroQuadrado();

                System.out.println();
                System.out.printf("Área do QUADRADO igual a: %.2f%n",areaDoQuadrado);
                System.out.printf("Perímetro do QUADRADO igual a: %.2f%n",perimetroDoQuadrado);
        break;
        case 2:
        
                //Retângulo
                System.out.println();

                Retangulo y = new Retangulo();
                System.out.println("<< RETÂNGULO >>");
                
                System.out.print("Digite o valor da BASE: ");
                y.baseRetangulo = sc.nextDouble();
        
                System.out.print("Digite o valor da ALTURA: ");
                y.alturaRetangulo = sc.nextDouble();
        
                double areaDoRetangulo = y.calculoAreaRetangulo();
                double perimetroDoRetangulo = y.calculoPerimetroRetangulo();
        
                System.out.println();
                System.out.printf("Área do RETÂNGULO igual a: %.2f%n",areaDoRetangulo);
                System.out.printf("Perímetro do RETÂNGULO igual a: %.2f%n",perimetroDoRetangulo);
        break;
        case 3:
                //Circulo
                System.out.println();
                
                Circulo z = new Circulo();
                System.out.println("<< CÍRCULO >>");
                
                System.out.print("Digite o valor da RAIO: ");
                z.raio = sc.nextDouble();

                double areaDoCirculo = z.calculoAreaCirculo();
                double perimetroDoCirculo = z.caluloPerimetroCirculo();
                
                System.out.println();
                System.out.printf("Área do CÍRCULO igual a: %.2f%n",areaDoCirculo);
                System.out.printf("Perímetro do CÍRCULO igual a: %.2f%n",perimetroDoCirculo);
        break;
        default:
        System.out.println("Opção inválida");
        break;
}
        System.out.println();
        System.out.print("DESEJA CALCULAR OUTRA FIGURA [S/N]: ");
        opContinuar = sc.next().charAt(0);
 }while(opContinuar == 's' || opContinuar == 'S');

 System.out.println();
 System.out.print("OBRIGADO PELA PREFERÊNCIA");
sc.close();

    }
}
