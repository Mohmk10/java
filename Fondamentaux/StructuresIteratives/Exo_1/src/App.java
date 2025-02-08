import java.util.Scanner;

/*
 * Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même).
 * Ainsi par exemple, l’entier 6 est parfait car 6 = 1 + 2 + 3.
 * Écrire un algorithme permettant de déterminer si un entier naturel est un nombre parfait.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\n Entier Parfait");
        int entier = saisie("Entrez un entier");

        boolean ok = entierParfait(entier);
        if (ok) {
            System.out.println("\n" + entier + " est un entier parfait\n");
        } else {
            System.out.println("\n" + entier + " n'est pas un entier parfait\n");
        }
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean entierParfait(int entier) {
        int a = 0;

        for(int i = 1; i < entier; i++) {
            if (entier % i == 0) {
                a+= i;
            }
        }
        if (a == entier) {
            return true;
        } else {
            return false;
        }
    }
}
