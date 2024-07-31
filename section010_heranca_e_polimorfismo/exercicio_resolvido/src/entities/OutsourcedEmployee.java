package entities;

public class OutsourcedEmployee extends Employee {
    //Atributos
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //Getters e Setters
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //Métodos
    @Override
    public final Double payment() {
        return super.payment() + getAdditionalCharge() * 1.10;
    }

    @Override
    public final String toString() {
        return this.getName() + " - " + this.payment();
    }
}