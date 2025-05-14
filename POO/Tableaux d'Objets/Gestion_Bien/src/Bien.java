
import java.util.Scanner;
public class Bien {

    static Scanner sn = new Scanner(System.in);

    private String reference;
    private String adresse;
    private double prix;
    private  Reservation res;

    public Bien(String reference, String adresse, double prix, Reservation res) {
        this.reference = reference;
        this.adresse = adresse;
        this.prix = prix;
        this.res = res;
    }

    public String getReference() {
        return reference;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getPrix() {
        return prix;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPrix(double prix) {
        
        this.prix = verifiecationPrix(prix);
    }

    static double verifiecationPrix(double prix) {

        while (prix < 0) {
            System.out.println("\nLe prix doit être supérieur à zéro '0' ");
            System.out.print("\nEntrez un prix: ");
            prix = sn.nextDouble();
        }

        return prix;
    }

    public Reservation getRes() {
        return res;
    }

    public void setRes(Reservation res) {
        this.res = res;
    }

    public void getBien(Bien bien) {
        System.out.println("\nRéference: " + bien.getReference());
        System.out.println("Adresse: " + bien.getAdresse());
        System.out.println("Prix: " + bien.getPrix());
    }

}
