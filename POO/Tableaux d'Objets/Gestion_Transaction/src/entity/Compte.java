package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Compte {
    private static int compteur = 0;
    private int id;
    private String numero;
    private double montant;
    private LocalDate date;
    private List<Transaction> transactions = new ArrayList<>();

    public Compte(String numero) {
        this.id = ++compteur;
        this.numero = numero;
        this.montant = 0.0;
        this.date = LocalDate.now();
    }

    public Compte() {
    }
    
    public int getId() {
        return id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
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
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction transaction) {
        this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        DateTimeFormatter fomat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormater = date.format(fomat);
        return "\nID: " + id + " \nNumero: " + numero + " \nMontant: " + montant + " \nDate de création: " + dateFormater
        + "\nTransactions: " + transactions.size();
    }
}
