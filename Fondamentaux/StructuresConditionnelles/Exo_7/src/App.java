import java.util.Scanner;

/*
 * Écrire un algorithme qui lit deux valeurs entières ( A et B ) puis les affichent dans l’ordre croissant et décroissant
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int entierA = saisie("Entrez un entier A");
        int entierB = saisie("Entrez un entier B");

        comparaison(entierA, entierB);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = scn.nextInt();

        return entier;
    }

    static void comparaison(int a, int b) {

        int nombreMin = 0, nombreMax = 0;
        

        if (a < b) {
            nombreMin = a;
            nombreMax = b;
            
        } else {
            nombreMin = b;
            nombreMax = a;
        }
            System.out.println("\nOrdre croissant\n");
            System.out.println(nombreMin + "\n" + nombreMax );
            System.out.println("\nOrdre décroissant\n");
            System.out.println(nombreMax + "\n" + nombreMin + "\n");
    }
}
