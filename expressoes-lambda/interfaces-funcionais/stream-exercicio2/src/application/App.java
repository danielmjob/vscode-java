package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) {
        System.out.println();

        /*
         * Fazer um programa para ler os dados (nome, email e salário)
         * de funcionários a partir de um arquivo em formato .csv.
         * Em seguida mostrar, em ordem alfabética, o email dos
         * funcionários cujo salário seja superior a um dado valor
         * fornecido pelo usuário.
         * Mostrar também a soma dos salários dos funcionários cujo
         * nome começa com a letra 'M'.
         * 
         * 
         * Input file:
         * Maria,maria@gmail.com,3200.00
         * Alex,alex@gmail.com,1900.00
         * Marco,marco@gmail.com,1700.00
         * Bob,bob@gmail.com,3500.00
         * Anna,anna@gmail.com,2800.00
         * 
         * 
         * Execution:
         * Enter full file path: c:\temp\in.txt
         * Enter salary: 2000.00
         * Email of people whose salary is more than 2000.00:
         * anna@gmail.com
         * bob@gmail.com
         * maria@gmail.com
         * Sum of salary of people whose name starts with 'M': 4900.00
         * 
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double baseSalary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> ordemAlfabetica = list.stream()
                    .filter(funcionario -> funcionario.getSalary() > baseSalary)
                    .map(funcionario -> funcionario.getEmail())
                    .sorted().collect(Collectors.toList());

            System.out.println();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", baseSalary));
            ordemAlfabetica.forEach(System.out::println);

            double soma = list.stream()
                    .filter(funcionario -> funcionario.getName().toUpperCase().charAt(0) == 'M')
                    .map(funcionario -> funcionario.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " +String.format("%.2f", soma)  );       

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}
