package entities;

public class Instrumento {

    private Integer codigo = null;
    private Integer quantidade;
    private String marca;
    private String modelo;
    private double preco;
    private String tipo;

    public Instrumento(){
    }

    public Instrumento( Integer codigo, int quantidade, String marca, String modelo, double preco, String tipo){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.tipo = tipo;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
/*
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
 */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void adicionarProduto(Integer quantidade){
        this.quantidade += quantidade;
    }

    public void retirarProduto(Integer quantidade){
        this.quantidade -= quantidade;
    }
    
    public void alterarPreco(double preco){
        this.preco = preco;
    }


 
    public String toString(){
        String tipoUpperCase = tipo.toUpperCase();

        
        return  tipoUpperCase
                + " código: "
                + codigo
                + ", "
                + quantidade
                + " iten(s), marca: "
                + marca
                + ", modelo: "
                + modelo
                + ", preço unitário R$: "
                + String.format("%.2f%n", preco);

    }
 
    
    
}
