import java.util.Scanner;

/*
 * Faire un programme qui saisit une  année et un mois  puis   détermine et affiche le nombre de jours de ce mois dans cette année
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);
        System.out.println("\nNombre de jours dans un mois à une année\n");

        System.out.print("Entrez une année: ");
        int annee = sn.nextInt();

        if (annee < 1900) {
            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
        } else {

            System.out.print("\nEntrez un mois: ");
            int mois = sn.nextInt();

            if (mois < 1 || mois > 12) {
                System.out.println("\nLe mois est compris entre 1 et 12\n"); 
            } else {
                switch (mois) {
                    case 1:
                        System.out.println("\nLe mois de Janvier de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 2:
                        if (annee % 4 == 0) {
                            if (annee % 100 != 0) {
                                System.out.println("\nLe mois de Février de l'année " + annee + " contient 29 jours\n");
                            } else 
                                if(annee % 400 == 0) {
                                    System.out.println("\nLe mois de Février de l'année " + annee + " contient 29 jours\n");
                                } else
                                    System.out.println("\nLe mois de Février de l'année " + annee + " contient 28 jours\n");
                        } else
                            System.out.println("\nLe mois de Février de l'année " + annee + " contient 28 jours\n");
                        break;
                    case 3:
                        System.out.println("\nLe mois de Mars de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 4:
                        System.out.println("\nLe mois de Avril de l'année " + annee + " contient 30 jours\n");
                        break;
                    case 5:
                        System.out.println("\nLe mois de Mai de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 6:
                        System.out.println("\nLe mois de Juin de l'année " + annee + " contient 30 jours\n");
                        break;
                    case 7:
                        System.out.println("\nLe mois de Juillet de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 8:
                        System.out.println("\nLe mois de Août de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 9:
                        System.out.println("\nLe mois de Septembre de l'année " + annee + " contient 30 jours\n");
                        break;
                    case 10:
                        System.out.println("\nLe mois de Octobre de l'année " + annee + " contient 31 jours\n");
                        break;
                    case 11:
                        System.out.println("\nLe mois de Novembre de l'année " + annee + " contient 30 jours\n");
                        break;
                    case 12:
                        System.out.println("\nLe mois de Décembre de l'année " + annee + " contient 31 jours\n");
                        break;
                    default:
                        break;
                }
            }
        }

        sn.close();
    }
}
