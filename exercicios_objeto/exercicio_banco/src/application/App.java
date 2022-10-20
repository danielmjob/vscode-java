package application;

import java.util.Locale;
import java.util.Scanner;
import application.entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(); //pular linha
        System.out.println("------------------");
        System.out.println("BANCO FICTÍCIO XYZ");
        System.out.println("------------------");

        System.out.println(); //pular linha
        System.out.println("SEJA BEM VINDO");


     

        System.out.println(); //pular linha
        System.out.print("Digite o número da conta: ");
        int numeroDaConta = sc.nextInt();
    
        System.out.print("Digite o nome do Titular da Conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();        

         Conta conta = new Conta(numeroDaConta, nomeTitular);

        System.out.print("Deseja fazer um depósito inicial? (S/N): ");
        
        char opcaoDepositoInicial = sc.next().charAt(0);

        double deposito;

        if(opcaoDepositoInicial == 's' || opcaoDepositoInicial =='S'){
            System.out.print("Digite o valor do depósito: ");
            deposito = sc.nextDouble();
            conta.depositarValor(deposito);

            System.out.println(); //pular linha
            
        }else{
            
        }


char opcaoContinuar;
        do {

            System.out.println("-------- MENU --------");
            System.out.println("[1] - EFETUAR DEPÓSITO");
            System.out.println("[2] - EFETUAR SAQUE");
            System.out.println("[3] - VER SALDO ");
            System.out.print("ESCOLHA A OPÇÃO DESEJADA: ");
            int opcaoMenu = sc.nextInt();
            System.out.println(); //pular linha

            switch(opcaoMenu){
                case 1:
                    System.out.println("<< ESCOLHIDO DEPÓSITO >>");
                    System.out.print("Digite o valor do Deposito: ");
                    deposito = sc.nextDouble();
                    conta.depositarValor(deposito);
                    System.out.println(); //pular linha                    
                break;

                case 2:
                    System.out.println("<< ESCOLHIDO SAQUE >>");
                    System.out.println("O banco cobra uma taxa de 5.00 R$ por saque");
                    double saque;
                    System.out.print("Digite o valor do Saque: ");
                    saque = sc.nextDouble();
                    conta.sacarValor(saque); 
                    System.out.println(); //pular linha      
                break;

                case 3:
                    System.out.println("<< ESCOLHIDO VER SALDO >>");
                    System.out.println(conta.toString());
                    System.out.println(); //pular linha      
                break;

                default:
                    System.out.println("<< OPÇÃO INVÁLIDA >>");
                    System.out.println(); //pular linha   
                break;

            }       


        System.out.print("Deseja fazer outra transação? (S/N): ");
        opcaoContinuar = sc.next().charAt(0);
    }while(opcaoContinuar =='s' || opcaoContinuar == 'S');

        sc.close();

        System.out.println(); //pular linha
        System.out.println("Obrigado por ser nosso cliente!");
        
    }
}
