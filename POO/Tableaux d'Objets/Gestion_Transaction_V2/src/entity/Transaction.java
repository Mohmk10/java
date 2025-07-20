package entity;

import java.time.LocalDate;
import utils.DateFormat;

public class Transaction {
    private static int compteur = 0;
    private int id;
    private double montant;
    private LocalDate date;
    private TypeTransaction type;
    private Compte compte;

    public Transaction(double montant, TypeTransaction type, Compte compte) {
        this.id = ++compteur;
        this.montant = montant;
        this.date = LocalDate.now();
        this.type = type;
        this.compte = compte;
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypeTransaction getType() {
        return type;
    }

    public Compte getCompte() {
        return compte;
    }

    @Override
    public String toString() {
        return "\nID: " + id + " \nMontant: " + montant + " \nType: " + type + "\nDate: " + DateFormat.formatDate(date);
    }

}
