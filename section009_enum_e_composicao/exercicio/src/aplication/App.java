package aplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Client data
        System.out.println("\nENTER CLIENT DATA: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDay = LocalDate.parse(sc.nextLine(), fmt);

        //Order data
        System.out.println("\nENTER ORDER DATA: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int quantityItems = sc.nextInt();

        Client client = new Client(name, email, birthDay);
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        for(int i = 1; i <= quantityItems; i++) {
            sc.nextLine();

            System.out.println("\nEnter #" + i + " item data:" );
            System.out.print("Product name: ");
            String nameProdutc = sc.nextLine();
            System.out.print("Product price: ");
            Double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity, new Product(nameProdutc, priceProduct)));
        }
        System.out.println(order);
        sc.close();
    }
}
