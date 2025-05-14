import java.util.Scanner;

/*
 * Version 2 : Reprendre le Même exercice (V_1)
 * 
 *  La classe Bien  est associée à la classe Propriétaire(id,nom,prenom,telephone).
 *  Un Bien est associé à un Propriétaire
 * 
 *   1. Définir la classe Propriétaire avec les méthodes :
 *     a. Constructeurs avec arguments et sans arguments
 *     b. Les Getters et Setters
 *     c. copy : qui copie les valeurs d’un objet 
 *     d. toChaine : qui convertit un objet en chaine
 *     e. egal: qui vérifie si deux objets de type Propriétaire sont égaux
 * 
 *   1. Dans la classe App.java,réaliser  les fonctions suivantes :
 *       a. Saisir un Propriétaire, l’id du propriétaire est généré automatiquement
 *       b. Saisir N Propriétaire
 *       c. Surcharger la méthode saisie un Bien sachant qu’a la saisie d’un bien on devra lui affecte un propriétaire
 *       d. Surcharger la méthode Afficher Bien qui affiche le bien ainsi que son proprietaire
 *       e. Déterminer le prioritaire qui a le plus de bien
 * 
 *   3. Définir une interface nomme Immobilier.java qui definit les methodes suivantes: 
 *       a. copy : qui copie les valeurs d’ un objet 
 *       b. toChaine : qui convertit un objet en chaine
 *       c. convert: qui convertit la superficie en m2 
 *       d. egal: qui vérifie si deux objets de type Bien sont égaux
 * 
 *   4. Redéfinir ces méthodes  dans les classes : 
 *       a. Propriétaire
 *       b. Bien
 *
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static int saisieInt (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static String saisie(String msg) {
        String a;
        System.out.println("\n" + msg + ": " );
        a = sn.next();

        return a;
    }

    static Proprietaire saisieProprietaire() {

        String nom = saisie("Entrez le nom");
        String prenom = saisie("Entrezle prenom");
        String tel = saisie("Entrez le n° de tel");

        return new Proprietaire(nom, prenom, tel);
    }

    static Proprietaire [] saisieNProprietaire() {

        int a = saisieInt("Voulez-vous saisir combien de Propriétaire ?");

        Proprietaire [] tabPro = new Proprietaire[a];

        for (int i = 0; i < tabPro.length; i++) {
            tabPro[i] = saisieProprietaire();
        }

        return tabPro;
    }

    static void menu() {
        System.out.println("\n1 - Oui\n");
        System.out.println("2 - Non\n");
    }

    static double saisieDouble (String message) {
        System.out.print("\n " + message + ": ");
        double entier = sn.nextDouble();

        return entier;
    }

    static String saisieString (String message) {
        System.out.print("\n " + message + ": ");
        String entier = sn.nextLine();

        return entier;
    }

    static int verificationID() {

        int id;
        do {
            id = saisieInt("Entrez un id");
            if (id < 0) {
                System.out.println("\nL'ID doit être positif !\n");
            }
        } while (id < 0);

        return id;
    }

    static double verificationDouble(String message) {
        double valeur;
        do {
            valeur = saisieDouble("Entrez " + message);
            if (valeur < 0) {
                System.out.println("\n" + message + "doit être positif !\n");
            }
        } while (valeur < 0);
        return valeur;
    }

    static boolean plus(String msg) {

        int a;
        do {
            a = saisieInt(msg);

        } while (a != 1 || a != 2);

        if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    static BienV1 saisieBien() {

        int id = verificationID();

        String reference = saisieString("Entrez une reference");
        String adresse = saisieString("Entrez une adresse");

        menu();
        boolean a = plus("Voulez-vous saisir les autres données");
        if (a) {
            double prix = verificationDouble("prix");
            String description = saisieString("Entrez une description");
            double superficie = verificationDouble("superficie");

            return new BienV1(id, reference, prix, description, superficie, adresse);
        } else {
            return new BienV1(id, reference, adresse);
        }
    }

}
