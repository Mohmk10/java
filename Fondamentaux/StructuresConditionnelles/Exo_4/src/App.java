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
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("Résolution d'une équation du 2nd degré: ax² + bx + c = 0");

        System.out.print("Entrez la valeur de a: ");
        int a = scn.nextInt();

        if (a == 0) {
            System.out.println("La valeur de a doit être différent de zero '0' ");
        } else {
            System.out.print("Entrez la valeur de b: ");
            int b = scn.nextInt();

            System.out.print("Entrez la valeur de c: ");
            int c = scn.nextInt();

            System.out.println();

            System.out.println("Pour l'equation: " + a + "x² + " + b + "x + " + c + " = 0");

            double delta = (b * b) - (4 * a * c);

            if (delta > 0) {
                float x1 = (float) (-b + (Math.sqrt(delta))) / (2 * a);
                float x2 = (float) (-b - (Math.sqrt(delta))) / (2 * a);

                System.out.println("Δ = b² - 4ac = " + delta + " > 0");

                System.out.println();

                System.out.println("Donc l'équation admet 2 solutions distinctes :");

                System.out.println();

                System.out.println("X1 = (-b + √Δ) / 2a = " + x1);
                System.out.println("X2 = (-b - √Δ) / 2a = " + x2);
            } else
                if (delta == 0) {
                    float x0 = (float) (-b) / (2 * a);
                    System.out.println("Δ = b² - 4ac = 0");

                    System.out.println();

                    System.out.println("Donc l'équation admet une solution double :");

                    System.out.println();

                    System.out.println("X0 = -b / 2a = " + x0);
                } else {
                    System.out.println("Δ = b² - 4ac = " + delta + " < 0");
                    System.out.println("Cette équation n'admet pas de solutions !");
                }
        }

        scn.close();
    }
}
