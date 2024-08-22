package aplication;

import java.util.Scanner;

import services.BrazilianService;
import services.TaxService;
import services.UsService;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        TaxService bs = new BrazilianService(2.0);
        TaxService us = new UsService(1.0);

        System.out.println(bs.payment(amount, months));
        System.out.println(us.payment(amount, months));

        sc.close();
    }
}
