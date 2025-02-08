import java.util.Scanner;

/*
 * Écrire un programme qui permet de saisir un nombre entier positif,
 * le programme détermine et affiche si le nombre est parfait  ou pas.
 * 
 * Déjà résolu dans l'exo 1
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
