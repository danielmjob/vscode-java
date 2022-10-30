package applicantion;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        

        for(int i = 0; i < n ; i++){
            System.out.println();
            System.out.println("Enter contract #"+ (i+1) +" data:");
            
            System.out.print("Date (DD/MM/YYYY): ");
           //Alteração comparadado ao original devido ao uso de LocalDate
            sc.nextLine();
            String dateString = sc.nextLine(); // peguei a data como um String
            DateTimeFormatter formatarDataDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatar data padrão dd/mm/aaaa
            LocalDate dateLocalDateDMY = LocalDate.parse(dateString, formatarDataDMY); // convertendo a String para data usando o padrão formatado

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(dateLocalDateDMY, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String dataStingMY = sc.nextLine(); 
     

        int month = Integer.parseInt(dataStingMY.substring(0,2)); // pegar o mes | substring inicia em 0 e termina em 2 um após o final real
        int year = Integer.parseInt(dataStingMY.substring(3)); // pegar o ano | começa do 3 e não precisa de delimitação
        
        /*
        * Entendendo o que foi feito acima
        * Criadas variaveis para separar o mes e o ano usando o substring
        * Exemplo:
        * 01/2001 
        * 0123456
        *
        */

        System.out.println();
        System.out.println("Name: " + worker.getName());
        System.out.println("Department:  " + worker.getDepartment().getName());
        
        System.out.println("Income for " + dataStingMY + ": " + String.format("%.2f",worker.income(year, month) ) );

        
        sc.close();
    }
}
