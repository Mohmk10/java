package entity;

import utils.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paiement {
    private LocalDate date;
    private double montant;

    private List<Dette> dettes = new ArrayList<>();

    public Paiement(double montant) {
        this.date = LocalDate.now();
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public List<Dette> getDettes() {
        return dettes;
    }

    @Override
    public String toString() {
        return "\nDate: " + DateFormat.formatDate(date) + "\nMontant: " + montant;
    }

}
