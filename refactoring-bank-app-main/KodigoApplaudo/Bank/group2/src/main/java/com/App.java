package com;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

import static com.Login.userLogin;
import static com.Register.createAccount;

public class App {

  public static void main(String[] args) throws FileNotFoundException {

    final HashMap<String, String> accounts = new HashMap<String, String>();

    boolean salir = true;

    Scanner scan = new Scanner(System.in);

    UserData user = new UserData();

    while (salir) {
      System.out.println("Choose an option:");
      System.out.println("a - Create an account");
      System.out.println("b - Login into an account");
      System.out.println("c - List account numbers");
      System.out.println("d - Exit");

      int opcion = scan.next().charAt(0);

      if (opcion == 'a') {
        createAccount(user.getsendUserName(), user.getsendUserID(), accounts);
      } else if (opcion == 'b') {

        userLogin(user.getsendUserName(), user.getsendUserID(), accounts);

        Client client = new Client(accounts.values(), accounts.keySet());
        Account account = new Account();
        Investment investment = new Investment();
        Bank bank = new Bank(client, account, investment);
        bank.menu();

      } else if (opcion == 'c') {
        listAccountNumbers(accounts);
      } else if (opcion == 'd') {
        salir = false;
        System.exit(0);
      } else
        System.out.println("Invalid choice\n");
    }
    System.exit(0);

  }

  public static void listAccountNumbers(HashMap<String, String> accounts) {

    if (accounts.isEmpty()) {
      System.out.println("No hay cuentas registradas todavía!\n");
    } else {
      for (String account : accounts.keySet()) {
        System.out.println("Nombre: " + accounts.get(account) + " | ID de cliente: " + account);
      }
    }
  }
}