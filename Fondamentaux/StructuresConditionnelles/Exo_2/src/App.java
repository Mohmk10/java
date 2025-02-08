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

       String op = menu();

       int entier2 = saisie("Entrez le 2nd entier");

       if (op.compareTo("a") == 0) {
            
            int somme = somme(entier1, entier2);
            System.out.println("\nLa somme de " + entier1 + " et " + entier2 + " est: " + somme + "\n");

        } else {
            if (op.compareTo("s") == 0) {

                int diff = difference(entier1, entier2);
                System.out.println("\nLa différence de " + entier1 + " et " + entier2 + " est: " + diff + "\n");

            } else {
                if (op.compareTo("m") == 0) {

                    int produit = produit(entier1, entier2);
                    System.out.println("\nLe produit de " + entier1 + " et " + entier2 + " est: " + produit + "\n");

                } else {
                    if (op.compareTo("d") == 0) {
                    
                        int quotient = quotient(entier1, entier2);
                        System.out.println("\nLe quotient de " + entier1 + " et " + entier2 + " est: " + quotient + "\n");
                    } else {
                        System.out.println("\nVeuillez choisir un caractère pour éffectuer l'opération souhaitée\n");
                    }
                }
            }
        }
    }

    static int saisie(String message) {
        System.out.print("\n " + message + ": " );
        int entier = scn.nextInt();

        return entier;
    }

    static String menu () {

        System.out.println("\na - Addition '+' ");
        System.out.println("\ns - Soustraction '-' ");
        System.out.println("\nm - Multiplation '*' ");
        System.out.println("\nd - Division '/' ");

        System.out.print("\nChoisissez l'opérateur: ");
        String op = scn.next();

        return op;
    }

    static int somme(int entier1, int entier2) {

        int somme = entier1 + entier2;
        return somme;
    }

    static int difference(int entier1, int entier2) {
        
        int diff = entier1 - entier2;
        return diff;
    }

    static int produit(int entier1, int entier2) {
        
        int produit = entier1 * entier2;
        return produit;
    }

    static int quotient(int entier1, int entier2) {
        
        int quotient = entier1 / entier2;
        return quotient;
    }

    
}
