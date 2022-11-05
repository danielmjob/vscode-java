import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1) + " data:");

            System.out.print("Outsourced (y/n)?: ");
            sc.nextLine();
            char op = sc.next().charAt(0);
            
            System.out.print("Name: ");
            sc.nextLine();
            String nameEmployee = sc.nextLine().toUpperCase();
            
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            
            
            if (op =='y' || op =='Y') {
             // Outsourced

                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                
                list.add(new OutsourceEmployee(nameEmployee, hours, valuePerHour,additionalCharge));
                
            }else {
             // Employee
                
                list.add(new Employee(nameEmployee, hours, valuePerHour));
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        System.out.println();

        for (Employee emp : list) {
            System.out.println(emp.getName()+ " - $ " + String.format("%.2f", emp.payment()));
        }    
    
        sc.close();
    }
}
