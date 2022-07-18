package com;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Scanner;

public class Register {

  @Getter @Setter

  Scanner input = new Scanner(System.in);
  private static final HashMap<String, String> accounts = new HashMap<String, String>();
  public static void createAccount(String name, String customerId) {
    accounts.put(customerId, name);
    System.out.println("Usuario creado");
  }
}
