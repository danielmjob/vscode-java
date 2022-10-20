package application.entities;



public class Conta {
    
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;
    private final double TAXA = 5.00;



//Construtores
    public Conta(){

    }

    public Conta(int numeroDaConta, String nomeTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta (int numeroDaConta, String nomeTitular,double saldo){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    // gerado apenas get pois apos criada o número da conta não pode mudar
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    // gerado apenas get pois para que haja mudança no valor o deverá ser feito atraves do deposito
    public double getSaldo() {
        return saldo;
    }

    public void depositarValor(double deposito){
        this.saldo = this.saldo + deposito;
    }

    public void sacarValor(double saque){
        this.saldo = this.saldo - saque - TAXA;
    }

    public String toString(){

        return "Conta "
            + this.numeroDaConta
            +", "
            + this.nomeTitular
            +", "
            +String.format("%.2f R$ %n",this.saldo);

    }

}
