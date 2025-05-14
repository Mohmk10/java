import java.util.Scanner;

/*
 *      Bien
 *  -id
 *  -reference
 *  -prix
 *  -description
 *  -superficie
 *  -adresse
 * 
 *  Version 1
 * Soit la classe Bien  définie ci-dessus.
 * 
 * 1. Définir la classe Bien avec les méthodes :
 *      a. Constructeurs avec arguments et sans arguments
 *      b. Les Getters et Setters
 *      c. copy : qui copie les valeurs d’ un objet 
 *      d. toChaine : qui convertit un objet en chaine
 *      e. convert: qui convertit la superficie en m2 
 *      f. egal: qui vérifie si deux objets de type Bien sont égaux
 * 2. Dans la classe App.java,réaliser  les fonctions suivantes :
 *      a. Saisir un Bien
 *      b. Afficher Bien
 *      c. Saisir N Bien
 *      d. Déterminer et afficher le bien qui a la superficie la plus grande 
 * 3. Contraintes
 *      a. La superficie est saisie en dm2
 *      b. Id, reference et adresse sont obligatoires
 *      3. Id, prix et superficie sont positifs

 */


public class AppV1 {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static void menu() {
        System.out.println("\n1 - Oui\n");
        System.out.println("2 - Non\n");
    }

    static int saisieInt (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
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

    static int verificationInt(String message) {
        int valeur;
        do {
            valeur = saisieInt("Entrez " + message);
            if (valeur < 0) {
                System.out.println("\n" + message + "doit être positif !\n");
            }
        } while (valeur < 0);
        return valeur;
    }

    static void afficheBien (BienV1 bien) {
        System.out.println( bien.toChaine() );
    }

    static BienV1 [] saisieNBien() {
        int a = saisieInt("Voulez-vous saisir combien de Bien ?");
        BienV1 [] tabBien = new BienV1 [a];

        for (int i = 0; i < tabBien.length; i++) {
            tabBien[i] = saisieBien();
        }
        return tabBien;
    }
}
