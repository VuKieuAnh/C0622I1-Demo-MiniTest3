package model.material;

import java.io.Serializable;
import java.time.LocalDate;

public class Product extends Material implements Serializable {
    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
}
