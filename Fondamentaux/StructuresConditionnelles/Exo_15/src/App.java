import java.util.Scanner;

/*
 * Faire un programme qui saisit une date (jour, mois et année) puis  détermine  et affiche la date qu’il fera dans 5 jours
 */

 public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nDate suivante dans 5 jours\n");

        int jour = saisie("Entrez une date (Jour)");
        int mois = saisie("Entrez une date (Mois)");
        int annee = saisie("Entrez une date (Année)");

        int jourMois = jourMoisAnnee(annee, mois);
        boolean ok = validationDate(jour, mois, annee);
        if (ok) {
            dateSuivanteCinqJours(jour, mois, annee, jourMois);
        } else {
            System.out.println("\nLa date entrée n'est pas valide !\n");
        }
        
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

    static int jourMoisAnnee(int annee, int mois) {
    
        int jourMois = 0;

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
        } else {

            switch (mois) {
                case 1:
                    jourMois = 31;
                    break;
                case 2:
                    boolean ok = anneeBissextile(annee);
                    if (ok) {
                        jourMois = 29;
                    } else {
                        jourMois = 28;
                    }
                    break;
                case 3:
                    jourMois = 31;
                    break;
                case 4:
                    jourMois = 30;
                    break;
                case 5:
                    jourMois = 31;
                    break;
                case 6:
                    jourMois = 30;
                    break;
                case 7:
                    jourMois = 31;
                    break;
                case 8:
                    jourMois = 31;
                    break;
                case 9:
                    jourMois = 30;
                    break;
                case 10:
                    jourMois = 31;
                    break;
                case 11:
                    jourMois = 30;
                    break;
                case 12:
                    jourMois = 31;
                    break;
                default:
                    jourMois = 0;
                    break;
            }
        }

        return jourMois;
    }

    static boolean validationDate(int jour, int mois, int annee) {

        int jourMois = 0;

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
            return false;
        } else {
            jourMois = jourMoisAnnee(annee, mois);

            if(jour <= jourMois) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    static void dateSuivanteCinqJours(int jour, int mois, int annee, int jourMois) {

        if((jour + 5) <= jourMois)
            jour += 5;
        else
            if ((jour + 5) > jourMois && mois != 12) {
                jour = (jour + 5) - jourMois;
                mois++;
            } else
                if ((jour + 5) > jourMois && mois == 12) {
                    jour = (jour + 5) - jourMois;
                    mois = 1;
                    annee++;
                }

        System.out.println("\nLa date dans 5 jours est: " + jour + " / " + mois + " / " + annee + "\n");
    }
}
