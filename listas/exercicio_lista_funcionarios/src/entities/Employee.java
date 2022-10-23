package entities;

public class Employee {

    private Integer id;
    private String nome;
    private Double salario;

    public Employee(){

    }
  
    public Employee(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario; 
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double salario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        this.salario += this.salario * (porcentagem/100);

    }

    @Override 
    public String toString (){
        String nomeUpperCase = nome.toUpperCase();
        return id
            + ", "
            + nomeUpperCase
            + ", "
            + String.format("%.2f%n", salario);
    }
}