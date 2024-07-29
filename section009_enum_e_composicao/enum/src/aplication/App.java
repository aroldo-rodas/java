package aplication;

import java.time.LocalDateTime;
import entities.classes.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        
        Order pedido = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(pedido);
    }
}
