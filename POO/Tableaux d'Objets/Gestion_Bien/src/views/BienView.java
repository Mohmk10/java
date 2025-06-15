package views;

import java.util.List;
import java.util.Scanner;

import entity.Bien;

public class BienView {
    private Scanner sc = new Scanner(System.in);

    public String saisieString(String message) {
        String ms = "";
        do {
            System.out.print("\n " + message + ": ");
            ms = sc.nextLine();
            if (ms.isBlank()) {
                System.out.println("\nCe champ est obligatoire");
            }
        } while (ms.isBlank());
        
        return ms;
    }

    public double saisieDouble(String message) {
        double prix = 0.0;
        do {
            System.out.print("\n " + message + ": ");
            prix = sc.nextDouble();
            if (prix <= 0) {
                System.out.println("\nLe prix doit être superieur à 0");
            }
        } while (prix <= 0);

        return prix;
    }

    public Bien saisieBien() {
        System.out.println("\n====Saisie d'un Bien (Appuyez sur Q pour quitter)====");
        String ref = saisieString("Entrez la réference");
        String adresse = saisieString("Entrez l'adresse");
        double prix = saisieDouble("Entrez le prix");

        return new Bien(ref, adresse, prix);
    }

    public void listerBien(List<Bien> biens) {
        if (biens == null) {
            System.out.println("Aucun Bien n'a été crée !!");
        } else {
            System.out.println("\n--- Liste des Biens ---");
            for (Bien bn : biens) {
                System.out.println(bn.toString());
            }
            System.out.println("---------------------\n");
        }
    }
}
