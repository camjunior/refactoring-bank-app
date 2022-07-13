package com;

public class RegClient extends Client {

    static double TaxRate = 0.15;

    public static double getTaxRate() {
        return TaxRate;
    }

    public RegClient(String name, String customerId) {
        super(name, customerId);
    }

}
