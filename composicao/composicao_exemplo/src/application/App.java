package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println();
        System.out.print("Enter department's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        // INSTANCIANDO UM NOVO WORKER | recebendo o workerName / WorkerLevel (converto de string para enum atraves do valueOf) / baseSalary / e ja Instancio um novo departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName)); 
        
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
           
        
        for(int i = 0; i < n ; i++){
            System.out.println();
            System.out.println("Enter contract #"+ (i+1) +" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String dateStringDMY = sc.nextLine(); // recebi a data como um String

         //IMPORTANTE | formatando Data
            DateTimeFormatter dateFormaterDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // criei um formato para data
            LocalDate localDateDMY = LocalDate.parse(dateStringDMY,dateFormaterDMY); // criei uma nova data ja no formato que preciso

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(localDateDMY, valuePerHour, hours);
            worker.addContract(contract); // adicionando contrato a lista de contratos do trabalhador
            
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String dateStringMY = sc.nextLine();

     // separando o mes do ano
        
        int month = Integer.parseInt(dateStringMY.substring(0, 2)); // pegar o mes | substring inicia em 0 e termina em 2 um após o final real
        int year = Integer.parseInt(dateStringMY.substring(3)); // pegar o ano | começa do 3 e não precisa de delimitação


       /*
        * Entendendo o que foi feito acima
        * Criadas variaveis para separar o mes e o ano usando o substring
        * Exemplo:
        * 01/2001 
        * 0123456
        */

        System.out.println("Name: " + worker.getName().toUpperCase()); // pegar o nome e ja mostrar com letras maiusculas
        System.out.println("Department: " + worker.getDepartament().getName().toUpperCase());// pegar o departamento e já mostrar com letras maiusculas
        System.out.println("Income for: " + dateStringMY + ": " + String.format("%.2f", worker.income(year, month)));
    
        sc.close();
    }
}
