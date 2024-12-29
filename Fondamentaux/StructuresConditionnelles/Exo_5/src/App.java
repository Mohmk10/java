
import java.util.Scanner;

/*
 * On désire écrire un algorithme qui permet d’afficher le jour correspondant à un chiffre allant de 1 à 7,
 * entré au clavier. Résoudre ce problème avec deux méthodes :  (si imbriquée , cas).
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("1 - Avec les if...else");
        System.out.println("2 - Avec le switch...case");

        System.out.print("Faites un choix: ");
        int choix = scn.nextInt();

        if (choix == 1) {
            System.out.println("if...else");
            System.out.println("Afficher un jour en choisissant le chiffre correspondant");

            System.out.println();

            System.out.print("Entrez un chiffre: ");
            int jourIf = scn.nextInt();

            if (jourIf == 1) 
                System.out.println("Lundi");
            else {
                if (jourIf == 2) 
                    System.out.println("Mardi");
                else {
                    if (jourIf ==3) 
                        System.out.println("Mercredi");
                    else {
                        if (jourIf == 4) 
                            System.out.println("Jeudi");
                        else {
                            if (jourIf == 5) 
                                System.out.println("Vendredi");
                            else {
                                if (jourIf == 6) 
                                    System.out.println("Samedi");
                                else {
                                    if (jourIf == 7) 
                                        System.out.println("Dimanche");
                                    else
                                        System.out.println("Veuillez choisir entre 1 et 7");
                                }
                                
                            }
                        }
                        
                    }
                    
                }
            }
        } else {
            if (choix == 2) {
                System.out.println("switch...case");
                System.out.println("Afficher un jour en choisissant le chiffre correspondant");

                System.out.println();

                System.out.print("Entrez un chiffre: ");
                int jourCase = scn.nextInt();

                switch (jourCase) {
                    case 1:
                        System.out.println("Lundi");
                        break;
                    case 2:
                        System.out.println("Mardi");
                        break;
                    case 3:
                        System.out.println("Mercredi");
                        break;
                    case 4:
                        System.out.println("Jeudi");
                        break;
                    case 5:
                        System.out.println("Vendredi");
                        break;
                    case 6:
                        System.out.println("Samedi");
                        break;
                    case 7:
                        System.out.println("Dimanche");
                        break;
                    default:
                        System.out.println("Veuillez choisir entre 1 et 7");
                        break;
                }
            } else
                System.out.println("Veuillez choisir entre 1 et 2");
        }

        scn.close();
    }
}
