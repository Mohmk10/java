import java.util.Scanner;

/*
 * Écrire un programme qui permet de saisir un entier entier positif,
 * le programme détermine et affiche si le entier est premier ou pas
 * 
 * Un entier est prémier s'il n'est divisible que par 1 et lui même
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nNombre premier");

        int entier = saisie("Entrez un entier");

       nombrePremier(entier);

        sn.close();
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void nombrePremier(int entier) {

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
            System.out.println("\nL'entier " + entier + " est premier\n");
        } else
            System.out.println("\nL'entier " + entier + " n'est pas premier\n");
    }
}
