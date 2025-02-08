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
 * 
 * Quelques autres exemples pour tester l'algo : 
 * 
 * 140 et 195
 * Diviseurs de 140 (sauf 1 et 140) : 2, 4, 5, 7, 10, 14, 20, 28, 35, 70 → Somme = 195
 * Diviseurs de 195 (sauf 1 et 195) : 3, 5, 13, 15, 39, 65 → Somme = 140
 * 
 * 1050 et 1925
 * Diviseurs de 1050 (sauf 1 et 1050) : 2, 3, 5, 6, 7, 10, 14, 15, 21, 25, 30, 35, 42, 50, 70, 75, 105, 150, 175, 210, 350, 525 → Somme = 1925
 * Diviseurs de 1925 (sauf 1 et 1925) : 5, 7, 11, 25, 35, 55, 77, 175, 275, 385 → Somme = 1050
 * 
 * 2024 et 2295
 * Diviseurs de 2024 (sauf 1 et 2024) : 2, 4, 8, 11, 22, 23, 44, 46, 88, 92, 184, 253, 506, 1012 → Somme = 2295
 * Diviseurs de 2295 (sauf 1 et 2295) : 3, 5, 9, 15, 17, 27, 45, 51, 85, 135, 153, 255, 459, 765 → Somme = 2024
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nLes nombres AMIS");

        int entierA = saisie("Entrez un entier (A)");
        int entierB = saisie("Entrez un entier (B)");

        int sommeEntierA = sommeEntier(entierA);
        int sommeEntierB = sommeEntier(entierB);

        boolean ok = nombresAmis(entierA, entierB, sommeEntierA, sommeEntierB);

        if (ok) {
            System.out.println("\nCes deux entiers " + entierA + " et " + entierB + " sont AMIS\n");
        } else {
            System.out.println("\nCes deux entiers " + entierA + " et " + entierB + " ne sont pas AMIS\n");
        }
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean nombresAmis(int entierA, int entierB, int sommeEntierA, int sommeEntierB) {

        if (sommeEntierA == entierB && sommeEntierB == entierA) {
            return true;
        } else {
            return false;
        }
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
