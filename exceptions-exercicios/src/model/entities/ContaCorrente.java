package model.entities;

import model.entities.enums.TipoConta;
import model.exceptions.DomainException;

public class ContaCorrente extends Conta {

    private TipoConta tipoConta;

    public ContaCorrente(Integer number, String holder, Double balance, Double withdrawLimit, TipoConta tipoConta) {
        super(number, holder, balance, withdrawLimit);
        this.tipoConta = tipoConta;
    }

    @Override
    public void deposit(Double amount) {
        super.balance += amount;
    }

    @Override
    public void withdraw(Double amount) throws DomainException {
       
        if (amount > super.balance) {
            throw new DomainException("Saldo insuficiente");
        }

        if (amount > getWithdrawLimit()){
            throw new DomainException("Saque acima do limite");
        }

        this.balance -= amount;

    }

    @Override
    public String toString(){
        return "\n"
            +"Dados da conta: \n"
            +"Número da conta: " + getNumber()
            + "\n"
            + "Cliente: " + getHolder()
            + "\n"
            + "Saldo em conta: R$  " + String.format("%.2f", getBalance())
            + "\n"
            + "Limite para saque " + String.format("%.2f", getWithdrawLimit())
            + "\n";
    }

}