import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Problema "negativos" 
         * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
         * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
         * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
         */

        Scanner sc = new Scanner(System.in);
        int n;

        do{    
            System.out.print("Quantos numeros voce vai digitar? ");
             n = sc.nextInt();

             if(n>10 || n<=1){
                System.out.println("O número tem de estar entre 1 a 10");
             }
             System.out.println();

        }while((n>10) || (n<=1));
         
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i+1) + "º numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS: ");

        for(int i = 0; i < vetor.length; i++){

            if(vetor[i]<0){
                System.out.println(vetor[i]);
            }

        }

         sc.close();
    }
}
