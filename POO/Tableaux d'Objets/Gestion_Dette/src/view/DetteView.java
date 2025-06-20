package view;

import java.util.Scanner;

import entity.Client;
import entity.Dette;
import service.DetteService;

public class DetteView {
    private Scanner sc = new Scanner(System.in);
    private DetteService detteService = new DetteService();

    public double saisieDouble(String message) {
        double x = 0.0;
        do {
            System.out.print("\n " + message + ": ");
            x = sc.nextDouble();
            if (x < 0) {
                System.out.println("\nLa valeur ne peut être négative");
            }
        } while (x < 0);

        return x;
    }

    public Dette saisieDette(Client client) {
        System.out.println("\n====Saisie d'une Dette====");
        double montantDette = saisieDouble("Entrez le montant de dette");
        double montantPayer = saisieDouble("Entrez le montant payer");

        return new Dette(montantDette, montantPayer, client);
    }

    public void afficherDette() {
        if (detteService.getDettes() == null) {
            System.out.println("\nLe tableau de Dettes est vide !!");
        } else {
            detteService.listerDette();
        }
    }



}
