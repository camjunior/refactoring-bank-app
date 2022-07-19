package com;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Scanner;

public class Register {

  @Getter @Setter

  Scanner input = new Scanner(System.in);

  public static void createAccount(String name, String customerId, HashMap<String, String> accounts) {
    accounts.put(customerId, name);
    System.out.println("Usuario creado");
  }
}
