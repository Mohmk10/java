import java.util.Scanner;

/*
 * Décomposition d’un montant en euros Écrire un algorithme permettant de décomposer
 * un montant entré au clavier en billets de 20, 10, 5 euros et pièces de 2, 1 euros,
 * de façon à minimiser le nombre de billets et de pièces.
 * 
 * Formule mathématiques
 * 
 * Prenons un montant de 87 euros :
 * 1. Billets de 20
 * n20 = 87/20 = 4
 * R1​ = 87 − (4 × 20) = 7 
 * 
 * 2. Billets de 10
 * n10 = 7/10 = 0
 * R2 = 7 - (0 x 10) = 7
 * 
 * 3. Billets de 5
 * n5 = 7/5 = 1
 * R3 = 7 - (1 x 5) = 2
 * 
 * 4.Pieces de 2
 * n2 = 2/2 = 1
 * R4 = 2 - (1 x 2) = 0
 * 
 * 5. Pieces de 1
 * n1 = 0
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int montant = saisie("Entrez un montant");

        decomposition(montant);
    }
    

    static int saisie(String message) {
        System.out.print("\n " + message + ": " );
        int entier = scn.nextInt();

        return entier;
    }

    static void decomposition (int montant) {

        int billet20 = 0;
        int billet10 = 0;
        int billet5 = 0;
        int pieces2 = 0;
        int piece1 = 0;

        if (montant > 20) {
            billet20 = montant / 20;
        }
            montant = montant % 20;

        if (montant >= 10) {
            billet10 = montant / 10;
        }
            montant = montant % 10;

        if (montant >= 5) {
            billet5 = montant / 5;
        }
            montant = montant % 5;

        if (montant >= 2) {
            pieces2 = montant / 2;
        }
            montant = montant % 2;

        if (montant == 1) {
            piece1 = 1;
        }

        System.out.println
        (
            "\nLe montant " + montant + " fait: \n\n" + 
            billet20 + " billet(s) de 20 \n\n" + 
            billet10 + " billet(s) de 10 \n\n" +
            billet5 + " billet(s) de 5 \n\n" + 
            pieces2 + " pièce(s) de 2 \n\n" + 
            piece1 + " piece de 1\n"
        );
    }
}