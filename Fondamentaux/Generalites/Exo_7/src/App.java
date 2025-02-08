import java.util.Scanner;

/*
 * Faire un programme qui saisit trois résistances : R1, R2 et R3.
 * Calculer et afficher la résistance en série : R1 + R2 +R3
 * Calculer et afficher la résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float r1 = saisie("Entrez la resistance R1");
        float r2 = saisie("Entrez la resistance R2");
        float r3 = saisie("Entrez la resistance R3");

        float serie = resistanceSerie(r1, r2, r3);
        float parallele = resistanceParallele(r1, r2, r3);

        System.out.println("\nLa résistance en serie: " + serie);
        System.out.println("\nLa résistance en parallèle: " + parallele + "\n");

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
