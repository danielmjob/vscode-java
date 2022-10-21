package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Problema "alturas" 
         * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
         * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
         * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
         * bem como os nomes dessas pessoas caso houver. 
        */


     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     System.out.print("Quantas pessoas serão digitadas? ");
     int numCadastros = sc.nextInt();

     Pessoa[] vetor = new Pessoa[numCadastros];

     for(int i = 0 ; i < vetor.length ; i++){

        System.out.println("Dados da "+ (i+1) +"a pessoa:");
        System.out.print("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        vetor[i] = new Pessoa(name, idade, altura);
     }


     double soma = 0.0;

     for(int i = 0 ; i < vetor.length ; i++){
        soma += vetor[i].getAltura();
     }

     double media = soma/vetor.length;

     
     
     int menores16 = 0;
     for(int i = 0; i < vetor.length ; i++){
         
         if(vetor[i].getIdade() < 16){
             menores16++;
            }
        }
        
        double porcMenores16 = menores16 * 100 / vetor.length;
        
        
     System.out.printf("Altura média: %.2f%n",media);
     System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",porcMenores16);


     for(int i = 0; i<vetor.length; i++){

        if(vetor[i].getIdade()<16){
            System.out.println(vetor[i].getNome());
        }


     }
















     sc.close();
    }
}
