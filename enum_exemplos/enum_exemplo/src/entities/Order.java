package entities;

import java.sql.Date;

import entities.enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;
    
    
    public Order() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Date getMoment() {
        return moment;
    }


    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public OrderStatus getStatus() {
        return status;
    }


    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    




    
}
