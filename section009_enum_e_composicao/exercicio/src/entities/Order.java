package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import entities.enums.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    //Métodos
    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sum = 0.0;

        for(OrderItem c : items) {
            sum += c.subTotal();
        }

        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order status: " + this.getStatus());
        sb.append("\nClient:  " + this.getClient().getName());
        sb.append(" " + this.client.getBirthDate().format(fmt) + " - ");
        sb.append(this.getClient().getEmail());
        sb.append("\nOrder items: \n");
        for(OrderItem oi : items) {
            sb.append(oi.getProduct().getName() + ", $");
            sb.append(String.format("%.2f ", oi.getProduct().getPrice()));
            sb.append("quantity: " + oi.getQuantity());
            sb.append(", subtotal: " + String.format("%.2f \n", oi.subTotal()));
        }
        return sb.toString();
    }
}
