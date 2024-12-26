import java.util.Scanner;

/*
 * Faire un programme qui saisit les coordonnées de 2 points A (x1, y1) et B (x2, y2)
 * et qui affiche la distance entre les 2 points.
 * Formule : distante = racine carrée de ((x1 – x2)² + (y1 – y2)²)
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("Coordonées du point A");
        System.out.print("Entrez x1: ");
        float x1 = scn.nextFloat();
        System.out.print("Entrez y1: ");
        float y1 = scn.nextFloat();
        System.out.println("Coordonées du point B");
        System.out.print("Entrez x2: ");
        float x2 = scn.nextFloat();
        System.out.print("Entrez y2: ");
        float y2 = scn.nextFloat();

        float distance = (float) Math.sqrt((((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2))));

        System.out.println();

        System.out.println("La distance entre A et B est: " + distance + " m");

        scn.close();

    }
}
