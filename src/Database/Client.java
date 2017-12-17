package Database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private String nameFirst, nameLast;
    private LocalDate clientDOB;
    private ArrayList<Pet> clientPetList = new ArrayList<>();
   // private ArrayList<Invoice> currentInvoice = new ArrayList<>();

    public Client(String nameFirst, String nameLast, LocalDate clientDOB, ArrayList<Pet> clientPetList) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.clientDOB = clientDOB;
        this.clientPetList = clientPetList;
      //  this.currentInvoice = currentInvoice;
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

    public ArrayList<Pet> getClientPetList() {
        return clientPetList;
    }

//    public ArrayList<Invoice> getCurrentInvoice() {
//        return currentInvoice;
//    }
}
