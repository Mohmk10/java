import java.util.Scanner;

/*
 *  Faire un programme qui saisit une date (jour, mois et année) puis  détermine  et affiche la date suivante.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nDate suivante\n");

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
                            switch (mois) {
                                case 1:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 2 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 2:
                                    if (jour == 28) {
                                        if (annee % 4 == 0) {
                                            if (annee % 100 != 0) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date suivante: 29 / 2 / " + annee + "\n");
                                            } else 
                                                if(annee % 400 == 0) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date suivante: 29 / 2 / " + annee + "\n");
                                                } else {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date suivante: 1 / 3 / " + annee + "\n");
                                                }
                                        } else
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date suivante: 1 / 3 / " + annee + "\n");
                                    } else {
                                        if (jour == 29) {
                                            if (annee % 4 == 0) {
                                                if (annee % 100 != 0) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date suivante: 1 / 3 / " + annee + "\n");
                                                } else 
                                                    if(annee % 400 == 0) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date suivante: 1 / 3 / " + annee + "\n");
                                                    } else
                                                        System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " n'est pas valide\n");
                                            } else
                                                System.out.println("\nCette date : " + jour + " / " + mois + " / " +  annee + " n'est pas valide\n");
                                        } else {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            jour++;
                                            System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                        }
                                    } 
                                    break;
                                case 3:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 4 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 4:
                                    if (jour == 30) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 5 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 5:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 6 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 6:
                                    if (jour == 30) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 7 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 7:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 8 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 8:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 9 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 9:
                                    if (jour == 30) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 10 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 10:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 11 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 11:
                                    if (jour == 30) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date suivante: 1 / 12 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                case 12:
                                    if (jour == 31) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        annee++;
                                        System.out.println("La date suivante: 1 / 1 / " + annee + "\n");
                                    } else {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        jour++;
                                        System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                    
                }
            }

        }

        sn.close();

    }
}