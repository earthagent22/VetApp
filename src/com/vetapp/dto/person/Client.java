package com.vetapp.dto.person;

import com.vetapp.dto.pet.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TODO add ID generator for new clients
public class Client {
    private String nameFirst, nameLast;
    private LocalDate clientDOB;
    private List<Pet> clientPetList = new ArrayList<>();
   // private ArrayList<Invoice> currentInvoice = new ArrayList<>();
    private int clientNumCount=0;
    private int clientID;

    public Client(String nameFirst, String nameLast, LocalDate clientDOB) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.clientDOB = clientDOB;
      //  this.currentInvoice = currentInvoice;

    }

    public String getFullName() {
        return nameFirst + " " + nameLast;
    }
    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public LocalDate getClientDOB() {
        return clientDOB;
    }

    public List<Pet> getClientPetList() {
        return clientPetList;
    }

    public int getClientID() {
        return clientID;
    }

    //    public ArrayList<Invoice> getCurrentInvoice() {
//        return currentInvoice;
//    }
    private void clientIDGenerator(){
        this.clientID = 10000 + clientNumCount;
        clientNumCount++;
    }

    public void addPet(Pet pet){
        clientPetList.add(pet);
    }

}
