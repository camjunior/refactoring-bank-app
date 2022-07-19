package com;

import java.util.Scanner;

public class UserData {

  Scanner input = new Scanner(System.in);

  public String getsendUserName() {
    System.out.println("Ingrese su nombre");
    String name = input.next();
    return name;
  }

  public void getUserName() {
    System.out.println("Ingrese su nombre");
    String name = input.next();
  }

  public String sendUserName(String name){
    return name;
  };

  public String getsendUserID() {
    System.out.println("Ingrese su ID");
    String customerId = input.next();
    return customerId;
  }

  public void getUserID() {
    System.out.println("Ingrese su ID");
    String customerId = input.next();
  }
}
