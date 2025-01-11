import java.util.Scanner;

/*
 * Écrire un algorithme qui lit trois valeurs entières ( A, B et C) puis les affichent dans l’ordre croissant et décroissant.
 */

 public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int entierA = saisie("Entrez un entier A");
        int entierB = saisie("Entrez un entier B");
        int entierC = saisie("Entrez un entier C");

        comparaison(entierA, entierB, entierC);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = scn.nextInt();

        return entier;
    }

    static void comparaison(int a, int b, int c) {

        int nombreMin = 0, nombreMax = 0, nombreMoy = 0;

        if (a > b && a > c) {
            nombreMax = a;

            if (b > c) {
                nombreMoy = b;
                nombreMin = c;
            } else {
                nombreMoy = c;
                nombreMin = b;
            }

        } else
            if (b > a && b > c) {
                nombreMax = b;

                if (a > c) {
                    nombreMoy = a;
                    nombreMin = c;
                } else {
                    nombreMoy = c;
                    nombreMin = a;
                }
                
            } else
                if (c > a && c > b) {
                    nombreMax = c;

                    if (a > b) {
                        nombreMoy = a;
                        nombreMin = b;
                    } else {
                        nombreMoy = b;
                        nombreMin = a;
                    }
            }

            System.out.println("\nOrdre croissant\n");
            System.out.println(nombreMin + "\n" + nombreMoy + "\n" + nombreMax );
            System.out.println("\nOrdre décroissant\n");
            System.out.println(nombreMax + "\n" + nombreMoy + "\n" +nombreMin + "\n");
    }
}

