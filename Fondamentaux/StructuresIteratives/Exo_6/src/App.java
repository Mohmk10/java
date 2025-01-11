import java.util.Scanner;

/*
 * Ecrire l’algorithme qui affiche la somme des prix d'une suite d'articles en CFA (entiers)
 * saisies par l'utilisateur et se terminant par zéro.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nSomme des prix d'articles");
        System.out.println("\nPour comptabiliser entrez zéro '0' ");

        sommePrixArticles();
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void sommePrixArticles() {

        int prix;
        int somme = 0 ;

        do {
            prix = saisie("Entrez un prix");

            if (prix < 0) {
                System.out.println("\nLe prix doit être supérieur à zéro '0' ");
                continue;
            }

            somme += prix;

        } while (prix != 0);

        System.out.println("\nLa somme des prix d'articles est: " + somme + " franc CFA\n");
    }
}
