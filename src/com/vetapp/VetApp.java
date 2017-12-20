package com.vetapp;

import com.vetapp.controllers.PracticeController;
import com.vetapp.dto.person.Client;
import com.vetapp.dto.pet.Pet;

import java.util.Scanner;

public class VetApp {
    private PracticeController practiceController;

    public VetApp() {
        this.practiceController = new PracticeController();
    }

    private Scanner scanner = new Scanner(System.in);

    private boolean quit = false;
    boolean selectionQuit;
    Client selectedClient;
    Pet selectedPet;


    public void runApp() {

        while(!quit) {
            selectionQuit = false;
            System.out.println("Welcome to Vet App! Please select from the following choices: ");
            printOptions();
            int homeOption = scanner.nextInt();

            switch (homeOption) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    while(!selectionQuit) {
                        searchOptions();
                    }
                    break;
            }
        }
        // home screen
        // search
        // create invoice
        // add client
        // add pet
        // add medication

        //search
    }
    //lambdas

    public void printOptions(){
        System.out.println("0 - Print options.");
        System.out.println("1 - Preform a search for a Client or Pet.");
        System.out.println("2 - Add and connect pets and clients.");
        System.out.println("3 - Add charges to a pet.");
        System.out.println("4 - Create an invoice for a client.");
        System.out.println("5 - Add a new treatment.");
    }

    public void searchOptions(){
        PracticeController practiceController = new PracticeController();
        System.out.println("Are you searching for a Client or a Pet?");
        System.out.println("1 - Client");
        System.out.println("2 - Pet");
        System.out.println("3 - Return to home screen.");
        int searchOptionInput = scanner.nextInt();
        switch (searchOptionInput){
            case 1:
                selectedClient = (practiceController.searchForClient());
                break;
            case 2:
                selectedPet=practiceController.searchForPet();
                break;
            case 3:
                selectionQuit = true;
                break;
            default:
                selectionQuit = true;
                break;
                //add try/catch to prevent bad entries
        }
    }
}
