import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner valeur d’une monnaie en CFA,
 * puis détermine et affiche sa correspondance en DOLLAR $ et en LIVRE STERLING £.
 */

public class App {

    final static float DOLLARS_USA = 0.0016f;
    final static float DOLLARS_STERLING = 0.00126f;

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float montant = saisie();
        float usa = conversionDollarUsa(montant);
        float sterling = conversionDollarSterling(montant);
        
        System.out.println("\n" + montant + " CFA" + " = " + usa + " $");
        System.out.println("\n" + montant + " CFA" + " = " + sterling + " £\n");
    }

    static float saisie() {
        System.out.print("\nEntrez un montant en franc CFA: ");
        float entier = scn.nextInt();

        return entier;
    }

    static float conversionDollarUsa(float montant) {

        float montantDollars = montant * DOLLARS_USA;
        return montantDollars;
    }

    static float conversionDollarSterling (float montant) {

        float montantSterling = montant * DOLLARS_STERLING;
        return montantSterling;
    }
}
