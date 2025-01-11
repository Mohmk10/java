import java.util.Scanner;

/*
 * Écrire un algorithme permettant de résoudre une équation du premier degré ax + b = 0
 */

 public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nRésolution d'une équation du 1er degré: ax + b = 0");

        float a = saisie("Entrez la valeur de a");
        equationPremierDegre(a);

    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextFloat();

        return entier;
    }

    static void equationPremierDegre(float a) {
        if (a == 0) {
            System.out.println("\nLa valeur de a doit être différent de zéro '0' \n");
        } else {
            float b = saisie("Entrez la valeur de b");
            float solution = -(b / a);

            System.out.println("\nLa solution de " + a + "x + " + b + " est: " + solution + "\n");
        }
    }
}
