package model;

import java.time.LocalDate;

public abstract class Material {
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
}
