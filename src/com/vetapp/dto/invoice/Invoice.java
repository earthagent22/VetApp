package com.vetapp.dto.invoice;
//TODO add ID generator for new invoices

//Clients should have a list of invoices, previous and current. All new charges get totaled onto the current.
//when payment is received the invoice should close automatically and a new one created when new charges are added

import java.util.ArrayList;

public class Invoice {
    private int invoiceID;
    private ArrayList<Charge> chargeList = new ArrayList<>();
    private double invoiceBalance;

    public Invoice() {
        this.invoiceID = invoiceID;
        this.chargeList = chargeList;
        this.invoiceBalance = invoiceBalance;
    }
}
