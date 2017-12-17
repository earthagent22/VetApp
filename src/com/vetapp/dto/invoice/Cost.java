package com.vetapp.dto.invoice;

import com.vetapp.types.DosageType;
import com.vetapp.types.CostType;

public class Cost {
    private String name;
    private CostType costType;
    private DosageType dosageType;

    public Cost() {}
    public Cost(String name, CostType costType, DosageType DosageType) {
        this.name = name;
        this.costType = costType;
        this.dosageType = dosageType;
    }

    public String getName() {
        return name;
    }

    public CostType getCostType() {
        return costType;
    }

    public DosageType getDosageType() {
        return dosageType;
    }
    public static final Cost nailTrim = new Cost("Nail Trim", CostType.PROCEDURE, DosageType.UNIT);
    public static final Cost metronidazoleSusp = new Cost("Metronidazole Suspension", CostType.MEDICATION, DosageType.ML);
    public static final Cost clavamox125mg = new Cost("Clavamox 125mg Tablets", CostType.MEDICATION, DosageType.PILLS);



}

