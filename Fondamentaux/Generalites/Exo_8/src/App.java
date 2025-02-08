import java.util.Scanner;

/*
 * Faire un programme qui saisit les coordonnées de 2 points A (x1, y1) et B (x2, y2)
 * et qui affiche la distance entre les 2 points.
 * Formule : distante = racine carrée de ((x1 – x2)² + (y1 – y2)²)
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nCoordonées du point A");
        float x1 = saisie("Entrez x1");
        float y1 = saisie("Entrez y1");
        System.out.println("\nCoordonées du point B");
        float x2 = saisie("Entrez x2");
        float y2 = saisie("Entrez y2");

        float distance = distance(x1, y1, x2, y2);

        System.out.println("\nLa distance entre A et B est: " + distance + " m\n");

    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextInt();

        return entier;
    }

    static float distance(float x1, float y1, float x2, float y2) {
        float distance = (float) Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2))));

        return distance;
    }
}
