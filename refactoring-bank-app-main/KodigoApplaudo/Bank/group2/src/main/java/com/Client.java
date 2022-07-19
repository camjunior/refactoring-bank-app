package com;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Set;

public class Client implements Persona {

  @Getter @Setter private String name;

  @Getter @Setter private String customerId;

  public Client(Collection<String> name, Set<String> customerId) {
    this.name = String.valueOf(name);
    this.customerId = String.valueOf(customerId);
  }
}
