import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        /*
         * CRIANDO VETORES
         * salvando dados primitivos
         * 
        */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int num = sc.nextInt();

        double[] vet = new double[num]; // criando "caixinhas" na memória onde [num] é o número de caixinhas

        //FOR para leitura do inserção de dados no vetor
        for (int i = 0; i < num; i++){

            System.out.print("Digite o " + ( i + 1 ) + "º número: ");

            vet[i] = sc.nextDouble(); // vetor na posição "i" recebe o valor digitado
        }

        System.out.println("NÚMEROS NO VETOR");

        
        //FOR para leitura do vetor
        for (int i = 0; i < num; i++){
            // System.out.println("Valor no vetor [" + i + "] " + vet[i]);

            System.out.print("Valor no vetor [" + i + "] ");
            System.out.println(String.format("%.1f", vet[i]));
        }


        //FOR para leitura do vetor e criação de soma e media
        double soma = 0.0;
        for (int i = 0; i < num; i++){
            soma += vet[i]; // a soma vai receber o que estiver na posição [i] do vetor
        }

        double media = soma / num; // a média é dada pelos valores somados dividido pelos números digitados

        System.out.printf("Soma de valores digitados: %.2f%n",soma);
        System.out.printf("Média de valores digitados: %.2f%n",media);


        sc.close();
    }
}
