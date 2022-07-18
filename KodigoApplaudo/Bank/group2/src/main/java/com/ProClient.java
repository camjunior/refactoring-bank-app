package com;

import java.util.Collection;
import java.util.Set;

public class ProClient extends Client {

    double TaxRate = 0.20;

    public double getProTaxRate() {
        return TaxRate;
    }

    public ProClient(Collection<String> name, Set<String> customerId) {
        super(name, customerId);
    }

}
