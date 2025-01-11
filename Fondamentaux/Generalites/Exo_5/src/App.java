import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner valeur d’une monnaie en CFA,
 * puis détermine et affiche sa correspondance en DOLLAR $ et en LIVRE STERLING £.
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        

        float montant = saisie();
        conversion(montant);


    }

    static float saisie() {
        System.out.print("\nEntrez un montant en franc CFA: ");
        float entier = scn.nextInt();

        return entier;
    }

    static void conversion (float montant) {
        final float DOLLARS_USA = 0.0016f;
        final float DOLLARS_STERLING = 0.00126f;

        float montantDollars = montant * DOLLARS_USA;
        float montantSterling = montant * DOLLARS_STERLING;

        System.out.println("\n" + montant + " CFA" + " = " + montantDollars + " $");
        System.out.println("\n" + montant + " CFA" + " = " + montantSterling + " £\n");
    }
}
