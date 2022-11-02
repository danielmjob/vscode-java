package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<OrderItem>();
    private Client client;

        public Order() {
    }

    public Order(Date moment, OrderStatus orderStatus, Client cliente) {
        this.moment = moment;
        this.status = orderStatus;
        this.client = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client cliente) {
        this.client = cliente;
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItem orderItem : items) {
            sum = sum + orderItem.subTotal();
        }
        return sum;
    } 


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment));
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append(" Client: ");
        sb.append(client + "\n" );
        sb.append("Order items: \n");
        for (OrderItem orderItem : items) {
            sb.append(orderItem + "\n");
        }
        sb.append("Total price: ");
        sb.append(String.format("%.2f",total() ));
        return sb.toString();

    }



  
}
