import java.util.Scanner;

/*
 * Écrire un algorithme calculatrice permettant la saisie du premier entier (a)
 * de l'opération ( + ou – ou * ou / : sont des caractères)
 * et du deuxième entier (b) et qui affiche le résultat.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner (System.in);

        System.out.print("Entrez le 1er entier: ");
        int entier1 = scn.nextInt();

        System.out.println("a - Addition '+' ");
        System.out.println("s - Soustraction '-' ");
        System.out.println("m - Multiplation '*' ");
        System.out.println("d - Division '/' ");

        System.out.println();

        System.out.print("Choisissez l'opérateur: ");
        String input = scn.next();

        System.out.println();

        // input.compareTo("a") == 0;
        if (input.compareTo("a") == 0) {
            System.out.print("Entrez le 2nd entier: ");
            int entier2 = scn.nextInt();
            int somme = entier1 + entier2;
            System.out.println("La somme de " + entier1 + " et " + entier2 + " est: " + somme);
        } else
            if (input.compareTo("s") == 0) {
                System.out.print("Entrez le 2nd entier: ");
                int entier2 = scn.nextInt();
                int diff = entier1 - entier2;
                System.out.println("La différence de " + entier1 + " et " + entier2 + " est: " + diff);
            } else
                if (input.compareTo("m") == 0) {
                    System.out.print("Entrez le 2nd entier: ");
                    int entier2 = scn.nextInt();
                    int produit = entier1 * entier2;
                    System.out.println("Le produit de " + entier1 + " et " + entier2 + " est: " + produit);
                } else 
                    if (input.compareTo("d") == 0) {
                        System.out.print("Entrez le 2nd entier: ");
                        int entier2 = scn.nextInt();
                        int quotient = entier1 / entier2;
                        System.out.println("Le quotient de " + entier1 + " et " + entier2 + " est: " + quotient);
                    } else
                        System.out.println("Veuillez choisir un caractère pour éffectuer l'opération souhaitée");

        scn.close();

    }
}
