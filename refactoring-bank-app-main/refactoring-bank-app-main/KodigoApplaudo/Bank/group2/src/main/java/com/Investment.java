package com;

public class Investment {

  Client client;
  double amtInv;
  static double years;

  static double presentValue(double amtInv) {
    if (amtInv != 0) {
      amtInv++;
    }
    return amtInv;
  }

  static double futureValue(double amtInv) {
    return presentValue(amtInv) * Math.pow(1 + Validation.typeOfClient(), years);
  }

  public void setYears(double years) {
    this.years = years;
  }

}
