package aplication;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Dados do trabalhador
         System.out.print("Enter departament's name: ");
         String departamentName = sc.nextLine();
         System.out.println("Worker data -------");
         System.out.print("Name: ");
         String workerName = sc.nextLine();
         System.out.print("Level: ");
         String workerLevel = sc.nextLine();
         System.out.print("Base salary: ");
         Double baseSalary = sc.nextDouble();

         //Criando trabalhador
         Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

         //Quantidade de contratos
         System.out.print("How many contracts to this worker? ");
         int numberContracts = sc.nextInt();

         for(int i = 1; i <= numberContracts; i++) {
            sc.nextLine();

            System.out.println("Enter contract " + i + " data#");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt1);

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            //Instanciar contrato
            HourContract hourContract = new HourContract(contractDate, valuePerHour,  hours);

            //Adiciona contrato ao trabalhador
            worker.addContratct(hourContract);
         }

         System.out.println();
         System.out.print("Enter month and year to calculate income: (MM/yyyy): ");
         String monthAndYear = sc.next();

         sc.close();

         int month = Integer.parseInt(monthAndYear.substring(0, 2));
         int year = Integer.parseInt(monthAndYear.substring(3));

         System.out.println("Name: " + worker.getName());
         System.out.println("Departament: " + worker.getDepartament().getName());
         System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
    }
}
