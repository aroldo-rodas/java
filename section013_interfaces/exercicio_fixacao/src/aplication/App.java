package aplication;

import model.entites.Contract;
import model.entites.Installment;
import model.services.ContractService;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ContractService contractService = new ContractService();
        
        System.out.println("###DADOS DO CONTRATO###");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: (dd/mm/yyyy): ");
        LocalDate date  = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Número de parcelas: ");
        int month = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        contractService.processContract(contract, month);

        for(Installment ins : contract.getInstallments()) {
            System.out.println("" + ins.getDueDate() + " " + ins.getQuantia());
        }

        sc.close();
    }
}
