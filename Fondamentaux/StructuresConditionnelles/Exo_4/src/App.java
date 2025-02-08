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

        int a = saisie("Entrez la valeur de a");
        if (a == 0) {
            System.out.println("La valeur de a doit être différent de zero '0' ");
        } else {
            int b = saisie("Entrez la valeur de b");
            int c = saisie("Entrez la valeur de c");

            System.out.println("\nPour l'equation: " + a + "x² + " + b + "x + " + c + " = 0");
            int delta = delta(a, b, c);

            if (delta > 0) {
                System.out.println("\nΔ = b² - 4ac = " + delta + " > 0");

                System.out.println("\nDonc l'équation admet 2 solutions distinctes :");
                float x1 = solutionX1(a, b, delta);
                float x2 = solutionX2(a, b, delta);

                System.out.println("\nX1 = (-b + √Δ) / 2a = " + x1);
                System.out.println("\nX2 = (-b - √Δ) / 2a = " + x2 + "\n");
                
            } else
                if (delta == 0) {
                    float x = solutionX(a, b);

                    System.out.println("\nΔ = b² - 4ac = 0");
                    System.out.println("\nDonc l'équation admet une solution double :");
                    System.out.println("\nX0 = -b / 2a = " + x + "\n");
                } else {
                    System.out.println("\nΔ = b² - 4ac = " + delta + " < 0");
                    System.out.println("\nCette équation n'admet pas de solutions !\n");
                }
        }


    }

    static int saisie(String message) {
        System.out.print("\n " + message + ": " );
        int entier = scn.nextInt();

        return entier;
    }

    static int delta(int a, int b, int c) {

        int delta = (b * b) - (4 * a * c);
        return delta;
    }

    static float solutionX1(int a, int b, int delta) {

        float x1 = (int) (-b + (Math.sqrt(delta))) / (2 * a);
        return x1;
    }

    static float solutionX2(int a, int b, int delta) {

        float x2 = (int) (-b - (Math.sqrt(delta))) / (2 * a);
        return x2;
    }

    static float solutionX(int a, int b) {

        float x = (-b) / (2 * a);
        return x;
    }
}
