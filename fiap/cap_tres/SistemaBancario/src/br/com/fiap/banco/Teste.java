package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args) {

        // TESTE UNITÁRIO DA CLASSE CONTA
   

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1111);
        cc.setNum(2222);
        cc.setTipo("PF");
        cc.depositar(500.0);
        cc.setChequeEspecial(1000.0);

        System.out.println(cc.getSaldoDisponivel());

       

        
        /*
         * Evitando o erro "java.lang.NullPointerException" quando uma varivel não tem
         * apontamento para um objeto
         * 
         * Conta cc2 = null;
         * 
         * if (cc2 != null) {
         *     cc2.depositar(1000.0);
         * }
         */

    }
}
