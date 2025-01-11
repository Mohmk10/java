
import java.util.Scanner;

/*
 * On désire écrire un algorithme qui permet d’afficher le jour correspondant à un chiffre allant de 1 à 7,
 * entré au clavier. Résoudre ce problème avec deux méthodes :  (si imbriquée , cas).
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\n1 - Avec les if...else");
        System.out.println("\n2 - Avec le switch...case");

        int choix = saisie("Faites un choix");

        if (choix == 1) {
            System.out.println("\nAfficher un jour en choisissant le chiffre correspondant");
            semaineIf();
        } else {
            if (choix == 2) {
                System.out.println("\nAfficher un jour en choisissant le chiffre correspondant");
                semaineSwitch();
            } else
                System.out.println("Veuillez choisir entre 1 et 2");
        }
    }


    static int saisie(String message) {
        System.out.print("\n " + message + ": " );
        int entier = scn.nextInt();

        return entier;
    }

    static void semaineIf() {

        int jourIf = saisie("Entrez un chiffre");

        if (jourIf == 1) 
            System.out.println("\nLundi\n");
        else {
            if (jourIf == 2) 
                System.out.println("\nMardi\n");
            else {
                if (jourIf ==3) 
                    System.out.println("\nMercredi\n");
                else {
                    if (jourIf == 4) 
                        System.out.println("\nJeudi\n");
                    else {
                        if (jourIf == 5) 
                            System.out.println("\nVendredi\n");
                        else {
                            if (jourIf == 6) 
                                System.out.println("\nSamedi\n");
                            else {
                                if (jourIf == 7) 
                                    System.out.println("\nDimanche\n");
                                else
                                    System.out.println("\nVeuillez choisir entre 1 et 7\n");
                            }
                        }
                    }
                }
            }
        }
    }

    static void semaineSwitch() {

        int jourCase = saisie("Entrez un chiffre");

        switch (jourCase) {
            case 1:
                System.out.println("\nLundi\n");
                break;
            case 2:
                System.out.println("\nMardi\n");
                break;
            case 3:
                System.out.println("\nMercredi\n");
                break;
            case 4:
                System.out.println("\nJeudi\n");
                break;
            case 5:
                System.out.println("\nVendredi\n");
                break;
            case 6:
                System.out.println("\nSamedi\n");
                break;
            case 7:
                System.out.println("\nDimanche\n");
                break;
            default:
                System.out.println("\nVeuillez choisir entre 1 et 7\n");
                break;
        }
    }
}
