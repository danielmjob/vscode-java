package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product produto) {
        this.quantity = quantity;
        this.price = price;
        this.product = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduto() {
        return product;
    }

    public void setProduto(Product produto) {
        this.product = produto;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(product.getName());
        sb.append(", $");
        sb.append(price);
        sb.append(" Quantity: ");
        sb.append(quantity);
        sb.append(", Subtotal: $");
        sb.append(subTotal() + "\n");

        return sb.toString();
    }
}
