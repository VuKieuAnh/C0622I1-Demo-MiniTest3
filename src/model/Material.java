package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Material implements Serializable {
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
}
