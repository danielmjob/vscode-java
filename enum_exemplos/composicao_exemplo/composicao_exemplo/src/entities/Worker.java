package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament; // composição | o trabalhador TEM UM departamento
    private List<HourContract> contracts = new ArrayList<HourContract>(); // composição | o trabalhador TEM VÁRIOS contratos
    
    public Worker() {
    
    }

    //IMPORTANTE | No construtor não é colocado o tipo List

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

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

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

 /* IMPORTANTE: 
  * Não foi feito o setContracts para que não haja o risco da lista do trabalhador ser trocada
  * pois um contrato só será adicionado ou removido da lista através de métodos
  */

  public void addContract(HourContract contract){
    contracts.add(contract);
  }

  public void removeContract(HourContract contract){
    contracts.remove(contract);
  }

  public Double income(int year, int month){
    double sum = 0;

    for (HourContract c : contracts) {
        int c_year = c.getDate().getYear();
        int c_month = c.getDate().getMonthValue();

        if (year == c_year && month ==c_month) {
            sum = sum + c.totalValue();
        }
    }
    return sum;
  } 

}
