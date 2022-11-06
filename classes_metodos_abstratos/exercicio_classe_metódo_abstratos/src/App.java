import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> payers = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            char op = sc.next().charAt(0);

            if(op == 'i' || op == 'I'){
                
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                payers.add(new Individual(name, anualIncome, healthExpenditures));

            }else if (op == 'c' || op == 'C'){

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();

                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();

                payers.add(new Company(name, anualIncome, numberOfEmployees));

            }else{
                // Se o usúario digitar uma opção inválida o contador não incrementará assim possibilitando que seja feita uma nova tentativa
                System.out.println();
                System.out.println("--- O p ç ã o   i n v á l i d a ---");
                System.out.println();
                i--;
            }
            System.out.println();
        }
        double sum = 0.0;
        System.out.println("TAXES PAID");
        for (TaxPayer taxPayer : payers) {
            System.out.println(taxPayer.toString());
            sum += taxPayer.tax();
        }
        
       
        System.out.println("TOTAL TAXES: $ "+String.format("%.2f", sum));

        sc.close();
    }
}
