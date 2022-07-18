package com;

import java.util.Collection;
import java.util.Set;

public class RegClient extends Client {

    static double TaxRate = 0.15;

    public static double getTaxRate() {
        return TaxRate;
    }

    public RegClient(Collection<String> name, Set<String> customerId) {
        super(name, customerId);
    }

}
