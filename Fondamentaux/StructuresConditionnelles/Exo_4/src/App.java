import java.util.Scanner;

/*
 * Écrire un algorithme permettant de résoudre une équation du second degré. 
 * ax² + bx + c = 0
 * 
 * Δ = b² − 4ac
 * 
 * Si Δ > 0 : deux solutions réelles distinctes.
 * Si Δ = 0 : une solution réelle double.
 * Si Δ < 0 : pas de solution réelle.
 * 
 * Si Δ > 0, deux solutions réelles distinctes :
 * X1 = (−b + √Δ) / 2a
 * X2 = (-b - √Δ) / 2a
 * 
 * Si Δ = 0, une solution unique double
 * X0 = -b / 2a
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nRésolution d'une équation du 2nd degré: ax² + bx + c = 0");

        float a = saisie("Entrez la valeur de a");

        equationSeconDegre(a);
    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextFloat();

        return entier;
    }

    static void equationSeconDegre (float a) {
        if (a == 0) {
            System.out.println("La valeur de a doit être différent de zero '0' ");
        } else {
            float b = saisie("Entrez la valeur de b");
            float c = saisie("Entrez la valeur de c");

            System.out.println("\nPour l'equation: " + a + "x² + " + b + "x + " + c + " = 0");

            double delta = (b * b) - (4 * a * c);

            if (delta > 0) {
                float x1 = (float) (-b + (Math.sqrt(delta))) / (2 * a);
                float x2 = (float) (-b - (Math.sqrt(delta))) / (2 * a);

                System.out.println("\nΔ = b² - 4ac = " + delta + " > 0");

                System.out.println("\nDonc l'équation admet 2 solutions distinctes :");

                System.out.println("\nX1 = (-b + √Δ) / 2a = " + x1);
                System.out.println("\nX2 = (-b - √Δ) / 2a = " + x2);
            } else
                if (delta == 0) {
                    float x0 = (float) (-b) / (2 * a);
                    System.out.println("\nΔ = b² - 4ac = 0");

                    System.out.println("\nDonc l'équation admet une solution double :");

                    System.out.println("\nX0 = -b / 2a = " + x0);
                } else {
                    System.out.println("\nΔ = b² - 4ac = " + delta + " < 0");
                    System.out.println("\nCette équation n'admet pas de solutions !\n");
                }
        }
    }
}
