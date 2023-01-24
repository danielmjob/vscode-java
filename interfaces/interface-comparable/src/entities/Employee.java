package entities;

public class Employee implements Comparable<Employee> {
    // usando a Interface Comparable para que possa ser comparado um objeto a outro
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /*
     * Comparar um objeto com o outro
     * Returns:
     * a negative integer, zero, or a positive integer as this object is less than,
     * equal to, or greater than the specified object.
     * 
     * Ex.:
     * 
     * System.out.println("maria".compareTo("alex"));
     * System.out.println("alex".compareTo("maria"));
     * System.out.println("maria".compareTo("maria"));
     * 
     * Output:
     * 12
     * -12
     * 0
     */

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }

    /*Nesse caso esta sendo comparado como nome, caso queira comparar os salários, basta mundar para 
     * return salary.compareTo(other.getSalary());
     * se quiser o salario em ordem decrescente basta adicionar o sinal de - no inicio
     * return -salary.compareTo(other.getSalary());
    */

}
