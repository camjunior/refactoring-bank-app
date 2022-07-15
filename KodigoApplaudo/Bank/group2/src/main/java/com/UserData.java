package com;

import java.util.Scanner;

public class UserData {

  Scanner input = new Scanner(System.in);

  public String getUserName() {
    System.out.println("Ingrese su nombre");
    String name = input.next();
    return name;
  }

  public String getUserID() {
    System.out.println("Ingrese su ID");
    String customerId = input.next();
    return customerId;
  }
}
