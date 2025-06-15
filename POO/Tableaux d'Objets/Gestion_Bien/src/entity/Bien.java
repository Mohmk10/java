package entity;

import java.util.ArrayList;
import java.util.List;

public class Bien {
    private String reference;
    private String adresse;
    private double prix;

    List<Reservation> reservations = new ArrayList<>();

    public Bien(String reference, String adresse, double prix) {
        this.reference = reference;
        this.adresse = adresse;
        this.prix = prix;
    }

    public Bien() {

    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservations(Reservation reservation) {
        this.reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "\nRéference: " + reference + "\nAdresse: " + adresse + "\nPrix: " + prix + "\nRéservations: "
                + reservations.size() + " réservation(s) sur ce Bien";
    }
}
