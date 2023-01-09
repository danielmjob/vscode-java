package model.entities;

import model.exceptions.DomainException;

//  NÃO criei a conta poupança apenas a corrente, apenas como forma de estudo

public abstract  class Conta {
    private Integer number;
    private String holder;
    protected Double balance;
    private Double withdrawLimit;

    public Conta(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public abstract void deposit(Double amount);

    public abstract void withdraw(Double amount) throws DomainException;

}
