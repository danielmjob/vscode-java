package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.ContaCorrente;
import model.entities.enums.TipoConta;
import model.exceptions.DomainException;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Abrindo conta para novo cliente");
        System.out.println();

        System.out.print("Numero da conta: ");
        Integer number = sc.nextInt();

        System.out.print("Cliente: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Limite para saque: ");
        Double withdrawLimit = sc.nextDouble();

        // o tipo da conta fiz em hardcode mesmo pois não fiz a conta poupança
        TipoConta tipoConta = TipoConta.CONTA_CORRENTE;

        ContaCorrente cc = new ContaCorrente(number, holder, 0.0, withdrawLimit, tipoConta);

        System.out.print("Valor do deposito inicial: ");
        Double amount = sc.nextDouble();
        cc.deposit(amount);

        System.out.println(cc);

        try {
            System.out.print("Qual o valor do saque: ");
            Double valorSaque = sc.nextDouble();
            cc.withdraw(valorSaque);

            System.out.println();
            System.out.println("***********************************");
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("***********************************");

        } catch (DomainException e) {
            System.out.println();
            System.out.println("***********************************");
            System.out.println("Erro na solicitação: " + e.getMessage());
            System.out.println("***********************************");
        } finally {

            System.out.println();
            System.out.println(cc);
        }

        sc.close();
    }
}
