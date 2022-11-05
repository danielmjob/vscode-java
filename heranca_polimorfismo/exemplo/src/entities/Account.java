package entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance; 
    
    /* 
    *  Usei o modificador protected para que o balance pudesse ser acessado pela classe BussinessAccount, 
    *  se estivesse private só poderia ser acessado pela propria classe e se estivesse public 
    */
    
    public Account() {
    
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    // não foi feito o metodo setBalance pois o valor da conta só sera alterado com um deposito ou retirada de valor

    public void withdraw (double amount){
        balance -= amount + 5.0;
    }

    public void deposit (double amount){
        balance += amount;
    }
        
}
