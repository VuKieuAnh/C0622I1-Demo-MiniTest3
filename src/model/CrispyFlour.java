package model;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private String name;

    public CrispyFlour() {
    }

    public CrispyFlour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
