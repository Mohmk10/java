import java.util.Scanner;

public class DateCompte {

    static Scanner sn = new Scanner(System.in);

    private int jour;
    private int mois;
    private int annee;

    public DateCompte(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public DateCompte() {

    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    /***********************/
    
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
                    System.out.println("\nLe mois est compris entre 1 et 12\n");
                    break;
            }
        }

        return jourMois;
    }

    boolean validationDate(int jour, int mois, int annee) {

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

    String dateCreation(int jour, int mois, int annee) {
        
        return "Date de création: " + jour + "/" + mois + "/" + annee;
    }


}
