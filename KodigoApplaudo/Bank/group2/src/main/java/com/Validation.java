package com;

import java.util.function.IntFunction;

public class Validation {

    Client client;

    // public boolean idValidation() {
    // if (Client.getCustomerId(equals(!=11))) {
    // return false;
    // }
    // return true;

    //

    public static String typeOfClient() {
        if (Account.getBal() >= 10.000) {
            return "ProClient";
        } else {
            return "RegClient";
        }

    }

}
