package view;

import java.util.Scanner;

import service.PaiementService;

public class PaiementView {
    private Scanner sc = new Scanner(System.in);
    private PaiementService paiementService = new PaiementService();

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

    // public Paiement saisiePaiement() {
    //     double montant = saisieDouble("Entrez le montant");
    //     return new Paiement(montant);
    // }

    public void affciherPaiement() {
        if (paiementService.getPaiements() == null) {
            System.out.println("\nLe tableau de Paiement est vide !!");
        } else {
            paiementService.listerPaiement();
        }
    }
}
