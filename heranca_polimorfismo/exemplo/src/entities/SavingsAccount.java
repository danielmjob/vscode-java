package entities;

public class SavingsAccount extends Account{
    
    private Double interestRate;

    public SavingsAccount (){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }  
    
    public void updateBalance(){
        balance += balance * interestRate;
    }

    // Sobrescrevendo o metódo withdraw 
    
    @Override
    // adicionel o final para que não haja mais sobreposições a esse método
    public final void withdraw (double amount){
        balance -= amount;
    }
}
