package com;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bank {

    Client client;
    Account account;
    Investment investment;

    public Bank(Client client, Account account) {
        this.client = client;
        this.account = account;

    }

    void menu() throws FileNotFoundException {
        char option;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome " + client.getName());
            System.out.println("Your ID:" + client.getCustomerId());
            System.out.println("\n");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Investments");
            System.out.println("f) Generate PDF");
            System.out.println("g) Exit");

            do {
                System.out.println("********************************************");
                System.out.println("Choose an option");
                option = sc.next().charAt(0);
                System.out.println("\n");

                switch (option) {

                    case 'a':
                        System.out.println("......................");
                        System.out.println("Balance =" + account.getBal());
                        System.out.println("......................");
                        System.out.println("\n");
                        break;
                    case 'b':
                        System.out.println("......................");
                        System.out.println("Enter a amount to deposit :");
                        System.out.println("......................");
                        double amt = sc.nextDouble();
                        account.deposit(amt);
                        System.out.println("\n");
                        break;
                    case 'c':
                        System.out.println("......................");
                        System.out.println("Enter a amount to Withdraw :");
                        System.out.println("......................");
                        double amtW = sc.nextDouble();
                        account.withdraw(amtW);
                        System.out.println("\n");
                        break;
                    case 'd':
                        System.out.println("......................");
                        System.out.println("Previous Transaction:");
                        account.getPreviousTrans();
                        System.out.println("......................");
                        System.out.println("\n");
                        break;

                    case 'e':
                        System.out.println("......................");
                        System.out.println("Enter a amount to invest:");
                        double amtInv = sc.nextDouble();
                        investment.presentValue(amtInv);
                        System.out.println("Enter how many years you want to invest this value:");
                        double yearInv = sc.nextDouble();
                        //investment.setYears(yearInv);
                        System.out.println("......................");
                        System.out.println("\n");
                        break;

                    case 'f':
                        System.out.println("......................");
                        System.out.println("PDF");
                        PdfGenerator pdfGenerator = new PdfGenerator();
                        System.out.println("......................");
                        System.out.println("\n");
                        break;

                    case 'g':
                        System.out.println("......................");
                        break;
                    default:
                        System.out.println("Choose a correct option to proceed");
                        break;
                }

            } while (option != 'g');
        }

        System.out.println("Thank you for using our banking services");

    }
}
