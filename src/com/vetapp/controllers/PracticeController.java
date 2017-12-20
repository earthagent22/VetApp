package com.vetapp.controllers;

import com.vetapp.dto.Practice.PracticeData;
import com.vetapp.dto.person.Client;
import com.vetapp.dto.pet.Pet;

import java.util.List;
import java.util.Scanner;

public class PracticeController {

    private Scanner scanner = new Scanner(System.in);
    private PracticeData data;

    public PracticeController() {
        this.data = new PracticeData();
    }

    public Client searchForClient() {
        System.out.print("Client Search - Enter client name: ");
        //system in
        String name = scanner.nextLine();

        List<Client> foundClients = data.findClient(name);
        if (foundClients != null && foundClients.size() == 1) {
            System.out.println("Found one client: " + foundClients.get(0).getFullName());
            return foundClients.get(0);
        } else if (foundClients != null && foundClients.size() > 1) {
            System.out.println("Found " + foundClients.size() + " clients containing " + name);
            for (int i = 0; i < foundClients.size(); i++) {
                Client c = foundClients.get(i);
                System.out.println((i + 1) + " - " + c.getFullName());
            }
            System.out.print("Please select the number of the client you are searching for: ");
            //get picked client and stuffgit
            int pickedClient = (scanner.nextInt()-1);
            return foundClients.get(pickedClient);
        } else {
            System.out.println("Client (" + name + ") not found");
            return null;
        }
    }

    public Pet searchForPet() {
        System.out.print("Client Search - Enter client name: ");
        //system in
        String name = scanner.nextLine();
        List<Pet> foundPets = data.findPet(name);
        if (foundPets.size() == 1) {
            System.out.println("Found one client: " + foundPets.get(0).getName());
            return foundPets.get(0);
        } else if (foundPets.size() > 1) {
            System.out.println("Found " + foundPets.size() + " pets containing " + name);
            for (int i = 0; i < foundPets.size(); i++) {
                Pet c = foundPets.get(i);
                System.out.println((i + 1) + " - " + c.getName() + " " + c.getOwnerList().get(0));
            }
            System.out.print("Please select the number of the pet you are searching for: ");
            //get picked client and stuff
            int pickedPet = (scanner.nextInt()-1);
            return foundPets.get(pickedPet);
        } else {
            System.out.println("Pet (" + name + ") not found");
            return null;
        }
    }
}
