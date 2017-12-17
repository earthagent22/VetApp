package Database;

public class Charge {
    private Cost item;
    private String chargeName;
    private double quantity;
    private Client client;
    private double chargePrice;

    public Charge(Cost item, double quantity) {
        this.item = item;
        this.chargeName = item.getName();
        this.quantity = quantity;
        this.client = client; // set to P default client
        this.chargePrice = chargePrice; //needs logic to determine $ from amount and cost
    }
}
