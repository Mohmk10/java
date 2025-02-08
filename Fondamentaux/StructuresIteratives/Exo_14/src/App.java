import java.util.Scanner;

/*
 * Écrire un programme qui permet de saisir un entier positif N,
 * le programme affiche tous les nombres premiers compris entre 1 et N
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\nNombre entier entre 1 et N");

        int entier = saisie("Entrez un entier");

        afficheNombrePremier(entier);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean nombrePremier(int entier) {

        int premier = 0;

        for (int i = 1; i < entier; i++) {
            if (entier % i == 0 && i != 1) {
                premier++;
            }
        }

        if (premier == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void afficheNombrePremier(int entier) {

        System.out.println("\nLes nombres premiers enre 1 et " + entier + " sont: \n");

        for (int i = 1; i < entier; i++) {
            boolean premier = nombrePremier(i);
            if (premier && i != 1) {
                System.out.print(i + "\t");
            }
        }
            System.out.println("\n");
    }
}
