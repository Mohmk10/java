import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner valeur d’une monnaie en CFA,
 * puis détermine et affiche sa correspondance en DOLLAR $ et en LIVRE STERLING £.
 */

public class App {
    public static void main(String[] args) throws Exception {

        final float DOLLARS_USA = 0.0016f;
        final float DOLLARS_STERLING = 0.00126f;

        Scanner scn = new Scanner(System.in);

        System.out.print("Entrez un montant en franc CFA: ");
        float a = scn.nextFloat();

        float montantDollars = a * DOLLARS_USA;
        float montantSterling = a * DOLLARS_STERLING;

        System.out.println();

        System.out.println(a + " CFA" + " = " + montantDollars + " $");
        System.out.println(a + " CFA" + " = " + montantSterling + " £");

        scn.close();

    }
}
