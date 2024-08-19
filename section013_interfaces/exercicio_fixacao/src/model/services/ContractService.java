package model.services;

import model.entites.*;
import java.time.LocalDate;;

public class ContractService {
    //Atributos
    OnlinePaymentService paypal; 

    //Construtores
    public ContractService() {
        this.paypal = new PaypalService();
    }

    public void processContract(Contract contract, Integer month) {
        double amount = contract.getTotalValue() / month;
        
        for(int i = 1; i <= month; i++) {
            double simpleInterest = paypal.interest(amount, i);
            double paymentFee = paypal.paymentFee(amount + simpleInterest);
            double total = amount + paymentFee + simpleInterest;
            LocalDate date = contract.getDate().plusMonths(i);
           
            contract.addInstallment(new Installment(date, total));
        }
    }
}
