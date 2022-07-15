package com;

public class Investment {

    Account account;
    double amtInv;
    static double interestRate;
    static double years;

    public double getAmtInv() {
        return amtInv;
    }

    public void setAmtInv(double amtInv) {
        this.amtInv = amtInv;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    static double returnInterestRate() {
        if (Validation.typeOfClient() == "ProClient") {
            return 0.20;

        } else {
            return 0.15;
        }

    }

    static double presentValue(double amtInv) {
        if (amtInv != 0) {
            amtInv++;
        }
        return amtInv;
    }

    static double futureValue(double amtInv) {
        return presentValue(amtInv) * Math.pow(1 + returnInterestRate(), years);
    }

}
