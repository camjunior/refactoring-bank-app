package com;

import java.util.Scanner;

import static com.Register.createAccount;

public class App {

  public static void main(String[] args) {

    boolean salir = false;

    Scanner scan = new Scanner(System.in);

    UserData user = new UserData();

    while (!salir) {
      System.out.println("Choose an option:");
      System.out.println("a - Create an account");
      System.out.println("b - Login into an account");
      //System.out.println("c - List account numbers");
      System.out.println("d - Exit");

      int opcion = scan.next().charAt(0);

      if (opcion == 'a') {
        createAccount(user.getsendUserName(), user.getsendUserID());
      } else if (opcion == 'b') {
      user.getsendUserName();
      user.getsendUserID();

      }else if (opcion == 'c') {
        /*listAccountNumbers();*/}
      else if (opcion == 'd') {
        break;
      } else {
        System.out.println("Invalid choice");
      }
    }


    Client client = new Client(user.getsendUserName(), user.getsendUserID());

    // No tocar
    Account account = new Account();
    Bank bank = new Bank(client, account);
    bank.menu();
    // No tocar
  }
}
