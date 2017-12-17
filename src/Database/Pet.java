package Database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pet {
    private String name;
    private LocalDate dateOfBirth;
    private Species species;
    private String breed;
    private double weight;
    private ArrayList<Client> ownerList = new ArrayList<>();
    private ArrayList<Charge> charges = new ArrayList<>();
}
