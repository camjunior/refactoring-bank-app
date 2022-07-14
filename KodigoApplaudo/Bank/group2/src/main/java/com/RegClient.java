package com;

public class RegClient extends Client {

    static double RegTaxRate = 0.15;

    public static double getRegTaxRate() {
        return RegTaxRate;
    }

    public RegClient(String name, String customerId) {
        super(name, customerId);
    }

}
