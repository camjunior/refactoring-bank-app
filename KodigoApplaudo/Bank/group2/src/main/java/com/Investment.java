package com;

public class Investment {

    Client client;
    double amtInv;
    double interestRate = RegClient.getTaxRate();
    double years;

    double presentValue(double amtInv) {
        if (amtInv != 0) {
            amtInv++;
        }
        return amtInv;
    }

    double futureValue() {
        return presentValue(0) * Math.pow(1 + interestRate, years);
    }

}
