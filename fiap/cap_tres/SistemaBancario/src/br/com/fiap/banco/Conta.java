package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * Basea no Exemplo do Curso da Fiap
 * 
 * @author Daniel Marques
 * @version 1.1
 * 
 */

public class Conta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {

    }

    public Conta(int agencia, int num, double saldo) {
        this.agencia = agencia;
        this.numero = num;
        this.saldo = saldo;
    }

    /**
     * @return int
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return int
     */
    public int getNum() {
        return numero;
    }

    public void setNum(int num) {
        this.numero = num;
    }

    /*
     * Não foi criado setSaldo
     * pois o saldo so deve ser alterado através de métodos especificos
     * como um deposito ou retirada
     */

    /**
     * Verificar o saldo da conta
     * 
     * @return o valor em conta
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * Acrescenta valor ao saldo da Conta
     * 
     * @param valor a ser depositado
     */

    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Retira um valor ao saldo da Conta
     * 
     * @param valor a ser retirado (sacado)
     */
    public void retirar(double valor) {
        this.saldo -= valor;
    }

 

}
