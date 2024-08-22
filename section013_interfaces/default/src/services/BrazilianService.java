package services;

public class BrazilianService implements TaxService{
    private Double interestRate;

    public BrazilianService() {
        
    }

    public BrazilianService(Double interestRate) {
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
