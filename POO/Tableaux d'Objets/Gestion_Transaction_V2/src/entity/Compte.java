package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    private static int compteur = 0;
    protected int id;
    protected String numero;
    protected double solde;
    protected LocalDate date;
    protected TypeCompte type;
    protected List<Transaction> transactions = new ArrayList<>();

    public Compte(String numero) {
        this.id = ++compteur;
        this.numero = numero;
        this.solde = 0.0;
        this.date = LocalDate.now();
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

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public LocalDate getDate() {
        return date;
    }

    public TypeCompte getType() {
        return type;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction (Transaction transaction) {
        transactions.add(transaction);
    }

    public abstract void depot (double montant);
    public abstract boolean retrait (double montant);
}
