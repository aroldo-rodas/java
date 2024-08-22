package services;

public class UsService implements TaxService{
    private Double interestRate;

    public UsService() {
        
    }

    public UsService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
