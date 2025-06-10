package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private static int compteur = 0;
    private int id;
    private double montant;
    private LocalDate date;
    private TypeTransaction type;

    public Transaction(double montant, TypeTransaction type) {
        this.id = ++compteur;
        this.montant = montant;
        this.type = type;
        this.date = LocalDate.now();
    }

    public Transaction() {
    }

    public enum TypeTransaction {DEPOT, RETRAIT};
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public LocalDate getDate() {
        return date;
    }
    public TypeTransaction getType() {
        return type;
    }
    public void setType(TypeTransaction type) {
        this.type = type;
    }

    @Override
    public String toString() {
        DateTimeFormatter fomat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormater = date.format(fomat);
        return "\nID: " + id + " \nMontant: " + montant + " \nType: " + type + "\nDate: " + dateFormater;
    }
}
