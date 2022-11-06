package br.com.fiap.banco;

public class ContaCorrente extends Conta{
    private String tipo;
    private Double chequeEspecial;

    public ContaCorrente(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public double getSaldoDisponivel(){
        return super.getSaldo()+getChequeEspecial();
    }

    @Override
    public void retirar(double valor) {
        valor += 10;
        super.retirar(valor);
    }
}
