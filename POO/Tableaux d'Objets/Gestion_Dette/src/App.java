/*
 * Ajouter  un client  dans un Tableau
 * Afficher les Clients du Tableau
 * Ajouter une Dette à un client
 * Lister dettes d’un client
 * Lister Montant total dû Par client
 * Ajouter un Paiement à une Dette
 * Lister les Payements d’une Dette d’un client
 * 
 *      Règles de Gestion :
 * Un client est caractérisé par son(nom,téléphone, adresse) et un client peut avoir plusieurs dettes
 * Une Dette caractérisé par date:chaine,montantDette,montantPaye,montantRestant et liste de paiements
 * montantRestant=montantDette-montantPaye
 * montantPaye=somme des paiements effectués sur la dette
 * Un paiement est caractérisé par   date:chaine et montant
 * Les montants sont positifs et le téléphone d’un client est unique 
 * A l’ajout d’un client on peut lui ajouter une  ou des dettes

 */


import java.util.Scanner;

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {





        /* *** */
        //System.out.println(-30 / 7); // 63 ne l'ont pas aimé et je dois être le 64e

        /* *** */
        
        // System.out.println(n*n);

        // // Compute and print the cube of n
        // System.out.println(n*n*n);

        // // Compute and print the fourth power of n
        // System.out.println(n*n*n*n);

        //103 p avaient aimé avant moi

        /* *** */

        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();

        if(a + b > c && a + c > b && b + c > b) {
            System.out.println("OUI");
        } else {
            System.out.println("NON");
        }

    }

    static int saisieInt(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int menu() {

        int choix;

        do {

            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Ajouter  un client  dans un Tableau");
            System.out.println("2 - Afficher les Clients du Tableau");
            System.out.println("3 - Ajouter une Dette à un client");
            System.out.println("4 - Lister dettes d’un client");
            System.out.println("5 - Lister Montant total dû Par client");
            System.out.println("6 - Ajouter un Paiement à une Dette");
            System.out.println("7 - Lister les Payements d’une Dette d’un client");
            System.out.println("8 - Quitter");
            System.out.println("======================");

            choix = saisieInt("Faites un choix: ");

            if (choix == 8) {
                break;
            }
            
        } while (choix == 8);

        return choix;
    }
}
