package model.services;

public class BrasilTaxa {
    public Double taxa(Double quantia) {
        if(quantia <= 100) {
            return quantia * 0.2;
        }
        else {
            return quantia * 0.15;
        }
    }
}
