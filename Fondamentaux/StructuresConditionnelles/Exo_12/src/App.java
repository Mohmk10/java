import java.util.Scanner;

/*
 *  Faire un programme qui saisit une date (jour, mois et année) puis  indique si la date est valide ou pas.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nNombre de jours dans un mois à une année\n");

        int jour = saisie("Entrez une date (Jour)");
        int mois = saisie("Entrez une date (Mois)");
        int annee = saisie("Entrez une date (Année)");

        validationDate(jour, mois, annee);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void validationDate(int jour, int mois, int annee) {

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

            if(jour <= jourMois)
                System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " est valide\n");
            else
                System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " n'est pas valide\n");
        }
    }
}