package com;

public class Validation {

    Client client;

    /*
     * public boolean IdValidation() {
     * if (Client.getCustomerId) {
     * return false;
     * }
     * return true;
     * 
     * }
     */

    public static double typeOfClient() {
        if (Account.getBal() >= 10000) {
            return 0.20;
        } else {
            return 0.15;
        }
    }

}
