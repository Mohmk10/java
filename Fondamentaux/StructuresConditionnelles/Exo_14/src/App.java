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

    static void datePrecedente(int jour, int mois, int annee) {

        int jourMois = 0;

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
        } else {

            switch (mois) {
                case 1:
                    jourMois = 31;
                    break;
                case 2:
                    if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
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
                    System.out.println("\nLe mois est compris entre 1 et 12\n");
                    break;
            }

            if (jour > jourMois) {
                System.out.println("\nLa date entrée n'est pas valide !\n");
            } else
                if(jour > 1)
                    jour--;
                else
                    if (jour == 1 && mois != 1) {
                        mois--;
                        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
                            jourMois = 31;
                        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                            jourMois = 31;
                        } else if (mois == 2) {
                            if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
                                jourMois = 29;
                            } else {
                                jourMois = 28;
                            }
                        }
                        jour = jourMois;
                    } else
                        if (jour == 1 && mois == 1) {
                            annee--;
                            mois = 12;
                            jour = 31;
                        }

            System.out.println("\nLa date précedente est: " + jour + " / " + mois + " / " + annee + "\n");
        }
    }
}