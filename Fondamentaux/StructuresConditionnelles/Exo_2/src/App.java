import java.util.Scanner;

/*
 * Écrire un algorithme calculatrice permettant la saisie du premier entier (a)
 * de l'opération ( + ou – ou * ou / : sont des caractères)
 * et du deuxième entier (b) et qui affiche le résultat.
 */

public class App {

    static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        int entier1 = saisie("Entrez le 1er entier");

        System.out.println("\na - Addition '+' ");
        System.out.println("\ns - Soustraction '-' ");
        System.out.println("\nm - Multiplation '*' ");
        System.out.println("\nd - Division '/' ");

        System.out.print("\nChoisissez l'opérateur: ");
        String op = scn.next();

        calculatrice(entier1, op);

    }

    static int saisie(String message) {
        System.out.print("\n " + message + ": " );
        int entier = scn.nextInt();

        return entier;
    }

    static void calculatrice(int entier1, String op) {

        if (op.compareTo("a") == 0) {
            int entier2 = saisie("Entrez le 2nd entier");
            int somme = entier1 + entier2;
            System.out.println("\nLa somme de " + entier1 + " et " + entier2 + " est: " + somme + "\n");
        } else
            if (op.compareTo("s") == 0) {
                int entier2 = saisie("Entrez le 2nd entier");
                int diff = entier1 - entier2;
                System.out.println("\nLa différence de " + entier1 + " et " + entier2 + " est: " + diff + "\n");
            } else
                if (op.compareTo("m") == 0) {
                    int entier2 = saisie("Entrez le 2nd entier");
                    int produit = entier1 * entier2;
                    System.out.println("\nLe produit de " + entier1 + " et " + entier2 + " est: " + produit + "\n");
                } else 
                    if (op.compareTo("d") == 0) {
                        int entier2 = saisie("Entrez le 2nd entier");
                        int quotient = entier1 / entier2;
                        System.out.println("\nLe quotient de " + entier1 + " et " + entier2 + " est: " + quotient + "\n");
                    } else
                        System.out.println("\nVeuillez choisir un caractère pour éffectuer l'opération souhaitée\n");
    }
}
