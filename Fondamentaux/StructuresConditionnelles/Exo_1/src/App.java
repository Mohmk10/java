import java.util.Scanner;

/*
 * Demander à l'utilisateur d’indiquer son choix.
 * S’il entre la valeur  1, calculer et afficher la résistance  en série.
 * S’il entre la valeur 2, calculer et afficher la résistance en parallèle.
 * Résistance en série : R1 + R2 +R3
 * Résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float r1 = saisie("Entrez la resistance R1");
        float r2 = saisie("Entrez la resistance R2");
        float r3 = saisie("Entrez la resistance R3");

        System.out.println("\n1 - Résistance en serie");
        System.out.println("\n2 - Résistance en parallèle");

        float choix = saisie("Faites un choix");

        float serie = resistanceSerie(r1, r2, r3);
        float parallele = resistanceParallele(r1, r2, r3);

        if (choix == 1) {
            System.out.println("\nLa résistance en serie: " + serie + "\n");
        } else {
            if (choix == 2) {
                System.out.println("\nLa résistance en parallèle: " + parallele + "\n");
            } else 
                System.out.println("Veuillez choisir 1 ou 2");
        }

    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextInt();

        return entier;
    }

    static float resistanceSerie(float r1, float r2, float r3) {

        float resistance = r1 + r2 + r3;
        return resistance;
    }

    static float resistanceParallele(float r1, float r2, float r3) {

        float resistance = (r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3);
        return resistance;
    }
}