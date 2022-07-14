package com;

import java.util.function.IntFunction;

public class Validation {

    Client client;
    private String ProClient;
    private String RegClient;

    // public boolean idValidation() {
    // if (Client.getCustomerId(equals(!=11))) {
    // return false;
    // }
    // return true;

    //

    public String typeOfClient() {
        if (Account.getBal() >= 10.000) {
            return ProClient;
        } else {
            return RegClient;
        }

    }

}
