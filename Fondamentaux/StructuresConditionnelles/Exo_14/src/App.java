import java.util.Scanner;

/*
 *  Faire un programme qui saisit une date (jour, mois et année) puis  détermine  et affiche la date précédente
 */

 public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nDate précedente\n");

        int jour = saisie("Entrez une date (Jour)");
        int mois = saisie("Entrez une date (Mois)");
        int annee = saisie("Entrez une date (Année)");

        datePrecedente(jour, mois, annee);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean anneeBissextile(int annee) {
    
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void datePrecedente(int jour, int mois, int annee) {

        int jourMois = 0;

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
        } else {
            if (jour == 1 && mois != 1 || jour > 1) {
                if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                    jourMois = 31;
                } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                    jourMois = 31;
                } else if (mois == 2) {
                    boolean ok = anneeBissextile(annee);
                    if (ok) {
                        jourMois = 29;
                    } else {
                        jourMois = 28;
                    }
                }
                if (jour > 1 && jour <= jourMois) {
                    jour--;
                } else {
                    if (jour == 1 && mois != 1 && jour < jourMois) {
                        mois--;
                        jour = jourMois;
                    }
                }
                
            } else {
                if (jour == 1 && mois == 1) {
                    annee--;
                    mois = 12;
                    jour = jourMois = 31;
                }
            }

            if (jour > jourMois) {
                System.out.println("\nLa date entrée n'est pas valide !\n");
            } else {
                System.out.println("\nLa date précedente est: " + jour + " / " + mois + " / " + annee + "\n");
            }
        }
    }
}