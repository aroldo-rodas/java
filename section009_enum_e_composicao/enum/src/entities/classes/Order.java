package entities.classes;

import java.time.LocalDateTime;

import entities.enums.OrderStatus;

public class Order {
    private Integer id;
    private LocalDateTime momento;
    private OrderStatus status;

    //Construtores
    public Order() {
    }

    public Order(Integer id, LocalDateTime momento, OrderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return this.getId() + ", " +
            this.getMomento() + ", " +
            this.getStatus();
    }
}
