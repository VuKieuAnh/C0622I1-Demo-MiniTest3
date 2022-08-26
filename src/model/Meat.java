package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends Material implements Discount, Serializable {
    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate  a = LocalDate.of(2022, 2, 30);
        LocalDate ngayHetHan = a.plusDays(7);

        return null;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
