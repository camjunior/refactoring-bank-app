package com;

import java.util.HashMap;

public class Login {

  public static void userLogin(String name, String customerId, HashMap<String, String> accounts) {

    boolean session = true;
    while (session) {
      if (accounts.containsKey(customerId) && accounts.containsValue(name)) {

        System.out.println("Sesión iniciada\n");
      } else
        System.out.println("No se encuentra un usuario con estos datos. Ingrese una cuenta válida");
    session = false;}
  }
}
