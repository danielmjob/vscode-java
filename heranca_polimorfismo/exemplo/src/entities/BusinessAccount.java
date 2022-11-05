package entities;

public class BusinessAccount extends Account { 
    // extends Account - quer dizer que a classe BussinessAccount tem todos os atributos e métodos da outra

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        
        if(amount <= loanLimit){
            balance -= amount - 10.00;
        }else{
            System.out.println("Limite Indisponivel");
        }
    }

    @Override
    public void withdraw (double amount){
        super.withdraw(amount);  // usando o super para reutilizar um método que está na SUPER CLASSE
        balance -= 2.0;
    }

    @Override
    public String toString(){
        return "Conta: " + getNumber() + " Titular: " + getHolder()+ " saldo: R$" + String.format("%.2f", getBalance())+" Limite: R$" + String.format("%.2f\n",getLoanLimit());
    }
    
}
