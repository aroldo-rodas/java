package aplication;

import entities.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of emplyees: ");
        int quantityEmplyee = sc.nextInt();

        for(int i = 1; i <= quantityEmplyee; i++) {
            sc.nextLine();
            System.out.println("Employee #" + i + " data: \n");

            System.out.print("Outsourced? (y/n): ");
            char outsourced = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(outsourced == 'n') {
                list.add(new Employee(name, hour, valuePerHour));
            }
            else {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
            }
        }

        sc.close();

        for(Employee emp : list) {
            System.out.println(emp);
        }
    }
}
