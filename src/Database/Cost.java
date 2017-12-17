package Database;

public class Cost {
    private String name;
    private CostType costType;
    private AmountType amountType;

    public Cost(String name, CostType costType, AmountType amountType) {
        this.name = name;
        this.costType = costType;
        this.amountType = amountType;
    }

    public String getName() {
        return name;
    }

    public CostType getCostType() {
        return costType;
    }

    public AmountType getAmountType() {
        return amountType;
    }
    public Cost nailTrim = new Cost("Nail Trim", CostType.PROCEDURE, AmountType.UNIT);
    public Cost metronidazoleSusp = new Cost("Metronidazole Suspension", CostType.MEDICATION, AmountType.ML);
    public Cost clavamox125mg = new Cost("Clavamox 125mg Tablets", CostType.MEDICATION, AmountType.PILLS);



}

