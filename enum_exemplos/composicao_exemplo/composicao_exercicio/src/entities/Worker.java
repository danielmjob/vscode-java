package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department; // de acordo com o diagrama um trabalhador tem um departamento
    private List<HourContract> contracts = new ArrayList<HourContract>(); // um trabalhador pode ter vários contratos (List deve sempre ser instanciada no inicio)

 // Construtores    
    public Worker(){

    }
    
 // IMPORTANTE: gerar o construtor sem qualquer atributo que seja do tipo List
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

 // Get and Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

 /* IMPORTANTE: 
  * Não foi feito o setContracts para que não haja o risco da lista do trabalhador ser trocada
  * pois um contrato só será adicionado ou removido da lista através de métodos
  */

 // Métodos

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

 // No curso o professor usou Date e Calender eu adaptei para LocalDate

    public double income (int year, int month){
        double sum = baseSalary;
        for (HourContract c : contracts) {
         
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();         
         
            if(year == c_year && month == c_month){
                sum = sum + c.totalValue(); 
            }
        }
        return sum;
    }

    
    


}
