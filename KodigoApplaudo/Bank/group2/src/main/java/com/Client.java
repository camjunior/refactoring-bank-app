package com;

import lombok.Getter;
import lombok.Setter;

public class Client implements Persona {

  @Getter @Setter private String name;

  @Getter @Setter private String customerId;

  public Client(String name, String customerId) {
    this.name = name;
    this.customerId = customerId;
  }
}
