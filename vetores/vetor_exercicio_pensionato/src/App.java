import java.util.Scanner;

import entities.Aluguel;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados: ");
        int num = sc.nextInt();

        Aluguel[] vetor = new Aluguel[10];


        for(int i = 0; i < num ; i++){
            
            System.out.println();
            System.out.println("ALUGUEL "+ (i+1) +"#");

            System.out.print("NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("EMAIL: ");
            String email = sc.nextLine();

            System.out.print("QUARTO: ");
            int numeroQuarto = sc.nextInt();

            vetor[numeroQuarto] = new Aluguel(nome, email);
        }

        System.out.println("QUARTOS ALUGADOS: ");
        System.out.println();

        for(int i = 0; i < vetor.length ; i++){

            if(vetor[i] != null){
                System.out.println(i + ": " + vetor[i].toString());
            }
        }

        sc.close();
        
    }
}
