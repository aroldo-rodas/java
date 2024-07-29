package entities;

import java.util.ArrayList;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {
    //Atributos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //Composição de objetos
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    //Construtores
    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Métodos
    public void addContratct(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = this.getBaseSalary();
        
        for(HourContract c : contracts) {
            int monthContratct = c.getDate().getMonthValue();
            int yearContract = c.getDate().getYear();

            if(year == yearContract && month == monthContratct) {
                sum += c.totalValue();
            }
        }
        
        return sum;
    }
}
