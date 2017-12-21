package com.vetapp.dto.Practice;

import com.vetapp.dto.person.Client;
import com.vetapp.dto.pet.Pet;

import java.util.ArrayList;
import java.util.List;

public class PracticeData {
    private List<Client> clientList;
    private List<Pet> petList;
//    private List<Vet> vets;
//    private Address address;
//    private PhoneNumber phoneNumber;


    public PracticeData() {
        this.clientList = new ArrayList<>();
        this.petList = new ArrayList<>();
    }

    public void addToClientList(Client client){
        clientList.add(client);
    }

    public void addToPetList(Pet pet){
        petList.add(pet);
    }




    public List<Client> findClient(int clientID){
        List<Client> foundClients = new ArrayList<>();
        for(int i = 0; i<clientList.size(); i++){
            if(clientID == clientList.get(i).getClientID()){
                foundClients.add(clientList.get(i));
            }
        }
        if(foundClients.size()>0){
            return foundClients;
        }
        return null;
    }
    public List<Client> findClient(String name){
        List<Client> foundClients = new ArrayList<>();
        for(int i = 0; i<clientList.size(); i++) {
            Client client = clientList.get(i);
            if(client.getFullName().contains(name)) {
                foundClients.add(client);
            }
        }   if(foundClients.size()>0) {
                return foundClients;
            }
        return null;
    }

    public List<Pet> findPet(int petID){
        List<Pet> foundPets = new ArrayList<>();
        for(int i = 0; i<petList.size(); i++){
            if(petID == petList.get(i).getPetID()){
                foundPets.add(petList.get(i));
            }
        }
        if(foundPets.size()>0){
            return foundPets;
        }
        return null;
    }
    public List<Pet> findPet(String name){
        List<Pet> foundPets = new ArrayList<>();
        for(Pet c : this.petList) {
            if(c.getName().contains(name)) {
                foundPets.add(c);
            }
        }
        if(foundPets.size()>0) {
            return foundPets;
        }
        return null;
    }



}
