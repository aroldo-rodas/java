package aplication;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import entities.*;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for(int i = 1; i <= numberProducts; i++) {
            sc.nextLine();

            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported? (c/u/i): ");
            char tag = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            switch (tag) {
                case 'c':
                    list.add(new Product(name, price));
                    break;

                case 'u':
                    sc.nextLine();
                    System.out.print("Manufacture date: (dd/mm/yyy): ");
                    String date = sc.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(date, fmt);
                    list.add(new UsedProduct(name, price, manufactureDate));
                    break;

                case 'i':
                    System.out.print("Customs fee: ");
                    Double fee = sc.nextDouble();
                    list.add(new ImporterdProduct(name, price, fee));
                    break;

                default:
                    break;
            }
        }

        sc.close();
        System.out.println();
        
        for(Product p : list) {
            System.out.println(p.priceTag());
        }
    }
}
