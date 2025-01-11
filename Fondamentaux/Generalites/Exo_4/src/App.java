import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle
 * et lui retourne sa surface et son périmètre.
 * 
 * Formule :
 * 
 * S = π × a²
 * P = 2 × π × a
 */
public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float rayon = saisie();
        surfacePerimetreCerle(rayon);

        
    }

    static float saisie() {
        System.out.print("\nEntrez le rayon: ");
        float entier = scn.nextInt();

        return entier;
    }

    static void surfacePerimetreCerle(float rayon) {
        final float PI =  3.14f;

        float surface = PI * (rayon * rayon);
        float perimetre = 2 * PI * rayon;

        System.out.println("\nSa surface: " + surface + "\n");
        System.out.println("\nSon périmètre: " + perimetre + "\n");
    }
}
