import java.util.Scanner;

/*
 * Écrire un programme qui permet de saisir une suite de nombres premiers,
 * le programme s'arrête lorsque l’utilisateur tape la valeur zéro (0).
 * Le programme affiche le nombre d’entiers saisi, le nombre de nombre premiers et affiche tous les nombre premiers.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\nNombre premier parmi les nombres");

        suiteNombrePremier();
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean nombrePremier(int entier) {

        int premier = 0;

        if (entier <= 1) {
            System.out.println("\n Ce nombre n'est pas premier\n");
        } else {
            for (int i = 1; i < entier; i++) {
                if (entier % i == 0 && i != 1) {
                    premier++;
                }
            }
        }

        if (premier == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void suiteNombrePremier() {

        int entier;
        int a = 0;
        int b = 0;

        do {
            entier = saisie("Entrez un entier (entrez 0 pour arrêtez)");
            if (entier != 0) {
                a++;
            }

            boolean premier = nombrePremier(entier);

            if (premier) {
                b++;

                System.out.println("\n " + entier + " est un nombre premier");
            }
            
        } while (entier != 0);

        System.out.println("\n" + a + " entier(s) saisi" + "\n\n" + b + " nombre(s) de nombre premier\n");
    }
}
