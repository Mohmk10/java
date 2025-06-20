package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Dette {
    private static int compteur = 0;
    private int id; // Ajouter
    private LocalDate date;
    private double montantDette;
    private double montantPayer;
    private double montantRestant;
    private StatutDette statut; // Ajouter

    private Client client = new Client();
    private List<Paiement> paiements = new ArrayList<>();

    public Dette(double montantDette, double montantPayer, Client client) {
        this.id = ++compteur;
        this.date = LocalDate.now();
        this.montantDette = montantDette;
        this.montantPayer = montantPayer;
        this.montantRestant = this.montantDette - this.montantPayer;
        this.client = client;
        this.statut = StatutDette.IMPAYER;
    }

    public Dette() {
        
    }

    public enum StatutDette {IMPAYER, REMBOURSER}

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getMontantDette() {
        return montantDette;
    }

    public void setMontantDette(double montantDette) {
        this.montantDette = montantDette;
    }

    public double getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(double montantPayer) {
        this.montantPayer = montantPayer;
    }

    public double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void addPaiement(Paiement paiement) {
        this.paiements.add(paiement);
    }

    public StatutDette getStatut() {
        return statut;
    }

    public void setStatut(StatutDette statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        DateTimeFormatter fomat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormater = date.format(fomat);
        return "\nID: " + id + "\nDate: " + dateFormater + "\nMontant de la dette: " + montantDette + "\nMontant payer: " + montantPayer +
                "\nMontant restant: " + montantRestant + "\nN° Client: " + client.getTel() + "\nNom du client: " + client.getNom() + 
                "\nNombre de paiements du client: " + paiements.size() + "\nStatut de la dette: " + statut;
    }
}
