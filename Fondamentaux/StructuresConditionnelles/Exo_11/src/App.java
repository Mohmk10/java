import java.util.Scanner;

/*
 * Faire un programme qui saisit une  année et un mois  puis   détermine et affiche le nombre de jours de ce mois dans cette année
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nNombre de jours dans un mois à une année\n");

        int annee = saisie("Entrez une année");
        int mois = saisie("Entrez un mois");

        jourMoisAnnee(annee, mois);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void jourMoisAnnee(int annee, int mois) {

        String moisLettre = "";
        int jourMois = 0;

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
        } else {

            switch (mois) {
                case 1:
                    moisLettre = "Janvier";
                    jourMois = 31;
                    break;
                case 2:
                    if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                        moisLettre = "Février";
                        jourMois = 29;
                    } else {
                        moisLettre = "Février";
                        jourMois = 28;
                    }
                    break;
                case 3:
                    moisLettre = "Mars";
                    jourMois = 31;
                    break;
                case 4:
                    moisLettre = "Avril";
                    jourMois = 30;
                    break;
                case 5:
                    moisLettre = "Mai";
                    jourMois = 31;
                    break;
                case 6:
                    moisLettre = "Juin";
                    jourMois = 30;
                    break;
                case 7:
                    moisLettre = "Juillet";
                    jourMois = 31;
                    break;
                case 8:
                    moisLettre = "Août";
                    jourMois = 31;
                    break;
                case 9:
                    moisLettre = "Septembre";
                    jourMois = 30;
                    break;
                case 10:
                    moisLettre = "Octobre";
                    jourMois = 31;
                    break;
                case 11:
                    moisLettre = "Novembre";
                    jourMois = 30;
                    break;
                case 12:
                    moisLettre = "Décembre";
                    jourMois = 31;
                    break;
                default:
                    System.out.println("\nLe mois est compris entre 1 et 12\n");
                    break;
            }

            System.out.println("\nLe mois de " + moisLettre + " de l'année " + annee + " contient " + jourMois + " jours\n");
        }
    }
}
