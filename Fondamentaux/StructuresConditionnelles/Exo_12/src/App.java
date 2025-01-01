import java.util.Scanner;

/*
 *  Faire un programme qui saisit une date (jour, mois et année) puis  indique si la date est valide ou pas.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nDate valide ou pas Jour Mois Année\n");

        System.out.print("Entrez une date (Jour): ");
        int jour = sn.nextInt();

        if (jour < 1 || jour > 31) {
            System.out.println("\nLe jour est compris en 1 et 31\n");
        } else {
            System.out.print("\nEntrez une date (Mois): ");
            int mois = sn.nextInt();

            if (mois < 1 || mois > 12) {
                System.out.println("\nLe mois est compris entre 1 et 12\n"); 
            } else {
                if (jour == 31 && mois == 4 || jour == 31 && mois == 6 || jour == 31 && mois == 9 || jour == 31 && mois == 11) {

                    System.out.println("\nPeu importe l'année, ce mois se limite toujours à 3O jours \n");
                    
                } else {
                    if (jour > 29 && mois == 2) {
                        System.out.println("\nPeu importe l'année, ce mois ne dépasse jamais 29 jours \n");
                    } else {
                        System.out.print("\nEntrez une date (Année): ");
                        int annee = sn.nextInt();

                        if (annee < 1900) {
                            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
                        } else {
                            if (mois == 2 && jour == 29) {
                                if (annee % 4 == 0) {
                                    if (annee % 100 != 0) {
                                        System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " est valide\n");
                                    } else 
                                        if(annee % 400 == 0) {
                                            System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " est valide\n");
                                        } else
                                            System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " n'est pas valide\n");
                                } else
                                    System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " n'est pas valide\n");

                            
                            } else
                                System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " est valide\n");
                        }
                    }
                    
                }
            }

        }

        sn.close();

    }
}
