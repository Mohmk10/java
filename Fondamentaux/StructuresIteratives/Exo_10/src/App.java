import java.util.Scanner;

/*
 * Écrire un programme qui permet de tester si deux nombres sont AMIS ou pas.
 * Deux nombres M et N sont amis si la somme des diviseurs de N excepté 1 et lui-même est égale à M
 * et la somme des diviseurs de M excepté 1 et lui-même est égale à N.
 * Exemple: les nombres 48 et 75 sont deux nombres amis puisque :
 * 
 * Les diviseurs de 48 sont: 2, 3, 4, 6, 8, 12, 16, 24 => 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24 = 75
 * 
 * Les diviseurs de 75 sont : 3, 5, 15, 25 => 3 + 5 + 15 + 25 = 48
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nLes nombres AMIS");

        int entierA = saisie("Entrez un entier (A)");
        int entierB = saisie("Entrez un entier (B)");

        int sommeEntierA = sommeEntier(entierA);
        int sommeEntierB = sommeEntier(entierB);

        nombresAmis(entierA, entierB, sommeEntierA, sommeEntierB);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void nombresAmis(int entierA, int entierB, int sommeEntierA, int sommeEntierB) {

        if (sommeEntierA == entierB && sommeEntierB == entierA) {
            System.out.println("\nCes deux entiers " + entierA + " et " + entierB + " sont AMIS\n");
        } else
            System.out.println("\nCes deux entiers " + entierA + " et " + entierB + " ne sont pas AMIS\n");
    }

    static int sommeEntier(int entier) {
        
        int sommeEntier = 0;

        for (int i = 1; i < entier; i++) {
            if (entier % i == 0 && i != 1) {
                sommeEntier += i;
            }
        }

        return sommeEntier;
    }
}
