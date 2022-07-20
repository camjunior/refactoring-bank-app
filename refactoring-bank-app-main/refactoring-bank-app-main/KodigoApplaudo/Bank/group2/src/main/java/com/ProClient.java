package com;

import java.util.Collection;
import java.util.Set;

public class ProClient extends Client {

    static double TaxRate = 0.20;

    public static double getProTaxRate() {
        return TaxRate;
    }

    public ProClient(Collection<String> name, Set<String> customerId) {
        super(name, customerId);
    }

}
