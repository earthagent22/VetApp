package com.vetapp;

import com.vetapp.dto.Practice.PracticeData;

public class Main {

    public static void main(String[] args) {
        VetApp vetApp = new VetApp();
        PracticeData data = new PracticeData();
        System.out.println("Initializing VetApp");
        vetApp.runApp();
    }
}
