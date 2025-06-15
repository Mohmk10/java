package entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int compteur = 0;
    private int id;
    private String nom;
    private String tel;
    private String adresse;
    List<Reservation> reservations = new ArrayList<>();

    public Client(String nom, String tel, String adresse) {
        this.id = ++compteur;
        this.nom = nom;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Client() {

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservations(Reservation reservation) {
        this.reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNom: " + nom + "\nTel: " + tel + "\nAdresse: " + adresse + "\nRéservations: "
                + reservations.size() + " Bien(s) réserver";
    }
}
