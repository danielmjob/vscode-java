package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {
    /*
     * implements Serializable - ao gerar um objeto apartir desta classe as
     * informções serão serializaveis de modo a serem transformadas em 
     * pacotes de bits para serem trafegados pela rede
     */
    private static final long serialVersionUID = 1L;
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
