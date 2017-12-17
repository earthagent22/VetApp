package com.vetapp.dto.pet;

import com.vetapp.dto.invoice.Charge;
import com.vetapp.dto.person.Client;
import com.vetapp.types.Species;

import java.time.LocalDate;
import java.util.ArrayList;
//TODO add ID generator for new Pets

public class Pet {
    private String name;
    private LocalDate dateOfBirth;
    private Species species;
    private String breed;
    private double weight;
    private ArrayList<Client> ownerList = new ArrayList<>();
    private ArrayList<Charge> charges = new ArrayList<>();
    private int petNumCount = 0;
    private int petID;

    public Pet(String name, LocalDate dateOfBirth, Species species, String breed, double weight, ArrayList<Client> ownerList) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.species = species;
        this.breed = breed;
        this.weight = weight;
        this.ownerList = ownerList;
        petIDGenerator();
    }

    public Pet(){ }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Species getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<Client> getOwnerList() {
        return ownerList;
    }

    public ArrayList<Charge> getCharges() {
        return charges;
    }

    public int getPetID() {
        return petID;
    }

    public void addClient(Client client){
        ownerList.add(client);
    }

    private void petIDGenerator(){
        this.petID = 10000 + petNumCount;
        petNumCount++;
    }
}
