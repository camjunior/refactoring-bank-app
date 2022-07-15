package com;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    UserData user = new UserData();

    Client client = new Client(user.getUserName(), user.getUserID());
    Account account = new Account();

    Bank bank = new Bank(client, account);
    bank.menu();
  }
}
