import java.lang.ref.Cleaner;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        /*
         * CRIANDO VETORES
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


        sc.close();
    }
}
