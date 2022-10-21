package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) {

        /*
         * VETOR
         * usado como referencia (ponteiro)
         */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar: ");
        int n = sc.nextInt();

        // Criando um vetor como um ponteiro/referencia
        Product[] vect = new Product[n]; 

        // FOR  para percorrer o vetor vect cadastrando itens
        for(int i = 0; i < vect.length; i++){ // >>IMPORTANTE subistitui a variavel "n" pelo "vect.legth" onde ele por si só sabe o tamanho do vetor
            System.out.print("Digite o nome do Produto: ");
            sc.nextLine(); //consumindo quebra de linha que ficou pendente no comando -> int n = sc.nextInt();
            String name = sc.nextLine();
            
            System.out.print("Digite o preço do Produto: ");
            double price = sc.nextDouble();
            
            // Instanciando o obejto na posição [i] dentro do vetor vect
            vect[i] = new Product(name, price);
        }

        // FOR para o calculo da soma de produtos
        double soma =0.0 ; //inciando a variavel com 0.0 (o ponto zero para é uma boa pratica para variaveis com ponto flutuante)
        for(int i = 0; i < vect.length; i++){ 
           soma +=  vect[i].getPrice(); //pegando preço usando o getPrice e fazendo a soma acumulada
        }

        System.out.println();//pular linha

        // Mostrando a média de valores dos produtos
        double media = soma/vect.length; // usei o vect,length pois ele retorna um int com tamanho do vetor.
        System.out.printf("Média de valores %.2f%n",media);
        System.out.println();//pular linha

        // FOR para percorre o vetor vect lendo itens cadastrados
        for(int i = 0; i < vect.length; i++){ 
            System.out.print(vect[i]);
        }






        

        



        



        sc.close();
    }
}
