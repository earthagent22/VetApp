package com.vetapp.dto.invoice;

import com.vetapp.dto.person.Client;

import java.time.LocalDate;

public class Charge {
    private Cost item;
    private String chargeName;
    private double quantity;
    private Client client;
    private double chargePrice;
    private LocalDate datePreformed;

    public Charge() {}

    public Charge(Cost item, double quantity) {
        this.item = item;
        this.chargeName = item.getName();
        this.quantity = quantity;
        this.client = client; // set to P default client
        this.chargePrice = chargePrice; //needs logic to determine $ from amount and cost
    }
}
