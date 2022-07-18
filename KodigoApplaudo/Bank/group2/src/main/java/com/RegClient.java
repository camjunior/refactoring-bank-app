package com;

import java.util.Collection;
import java.util.Set;

public class RegClient extends Client {

    static double RegTaxRate = 0.15;

    public static double getRegTaxRate() {
        return RegTaxRate;
    }

    public RegClient(Collection<String> name, Set<String> customerId) {
        super(name, customerId);
    }

}
