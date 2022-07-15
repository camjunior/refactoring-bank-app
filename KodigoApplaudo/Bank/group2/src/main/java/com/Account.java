package com;

class Account {
  double bal;
  double prevTrans;

  public double getBal() {
    return bal;
  }

  public void setBal(double bal) {
    this.bal = bal;
  }

  public double getPrevTrans() {
    return prevTrans;
  }

  public void setPrevTrans(double prevTrans) {
    this.prevTrans = prevTrans;
  }

  double deposit(double amount) {
    if (amount != 0) {
      bal += amount;
      prevTrans = amount;
    }
    return amount;
  }

  void withdraw(double amt) {
    if (amt != 0 && bal >= amt) {
      bal -= amt;
      prevTrans = -amt;
    } else if (bal < amt) {
      System.out.println("Bank balance insufficient");
    }
  }

  void getPreviousTrans() {
    if (prevTrans > 0) {
      System.out.println("Deposited: " + prevTrans);
    } else if (prevTrans < 0) {
      System.out.println("Withdrawn: " + Math.abs(prevTrans));
    } else {
      System.out.println("No transaction occured");
    }
  }
}
