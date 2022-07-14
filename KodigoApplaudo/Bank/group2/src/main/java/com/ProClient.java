package com;

public class ProClient extends Client {

    double TaxRate = 0.20;

    public double getProTaxRate() {
        return TaxRate;
    }

    public ProClient(String name, String customerId) {
        super(name, customerId);
    }

}
