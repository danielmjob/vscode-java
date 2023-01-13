package entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(){

    }

    public Product(String nome, Double price, Integer quantidade) {
        this.name = nome;
        this.price = price;
        this.quantity = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantidade) {
        this.quantity = quantidade;
    }

    
    public Double total(){
        return this.quantity * this.price;
    }

    
    
}
