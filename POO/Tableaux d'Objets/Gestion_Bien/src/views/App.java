package views;
/*
 * 1. Ajouter un Bien dans un Tableau
 * 2. Afficher les Biens du Tableau
 * 3. Ajouter une Réservation à un Bien
 * 4. Lister les Réservations d’un Bien
 * 5. Lister les Réservations d’un Client
 * 6. Quitter
 * 
 * ** Règles de Gestion :
 * 
 * Un Bien est caractérisé par (reference, adresse, prix).Sur un bien on peut faire plusieurs réservations
 * Une Réservation est caractérisée par date:chaîne et son client qui est caractérisé par son(nom, téléphone, adresse)
 * Un client peut faire plusieurs réservations
 * Les montants sont positifs et le reference d’un bien est unique
 * 
 * Fonctionnalités necessaires ajoutés:
 * 1. Ajouter un Client dans un Tableau
 * 
 * Fonctionnalités suggérés:
 * 1. Afficher les Clients du Tableau

 */



import java.util.Scanner;

import entity.Bien;
import entity.Client;
import service.BienService;
import service.ClientService;
import service.ReservationService;
public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Bien bien = new Bien();
        BienService bienService = new BienService();
        BienView bienView = new BienView();
        Client client = new Client();
        ClientService clientService = new ClientService();
        ClientView clientView = new ClientView();
        ReservationService reservationService = new ReservationService();
        ReservationView reservationView = new ReservationView();

        int menu;

        do {
            
            menu = menu();
            switch (menu) {
                case 1:
                    bien = bienView.saisieBien();
                    bienService.addBien(bien);
                    System.out.println("\nBien ajouté avec succès\n");
                    break;
                case 2:
                    client = clientView.saisieClient();
                    clientService.addClient(client);
                    System.out.println("\nClient ajouté avec succès\n");
                    break;
                case 3:
                    bienView.listerBien(bienService.getBiens());
                    break;
                case 4:
                    System.out.println("\nFonctionnalités en attente\n");
                    break;
                case 5:
                    System.out.println("\nRenseignez obligatoirement un Bien et un Client valide\n");
                    System.out.println("\n==== Client====\n");
                    String tel = saisieString("Tel du Client");
                    Client client1 = clientService.rechercheParTel(tel);

                    if (client1 == null) {
                        System.out.println("Ce Client n'existe pas");
                        break;
                    } 

                    System.out.println("\n==== Bien====\n");
                    String ref = saisieString("Ref du Bien");
                    Bien bien1 = bienService.rechercheParRef(ref);

                    if (bien1 == null) {
                        System.out.println("Ce Bien n'existe pas");
                        break;
                    }

                    reservationService.addReservation(client1, bien1);
                    System.out.println("\nBien réservé avec succès\n");
                    break;
                case 6:
                    System.out.println("\nRenseignez obligatoirement un Bien valide\n");
                    System.out.println("\n==== Bien====\n");
                    String ref2 = saisieString("Ref du Bien");
                    Bien bien2 = bienService.rechercheParRef(ref2);

                    if (bien2 == null) {
                        System.out.println("Ce Bien n'existe pas");
                        break;
                    }

                    reservationView.listerReservationBien(bien2);
                    break;
                case 7:
                    System.out.println("\nRenseignez obligatoirement un Client valide\n");
                    System.out.println("\n==== Client====\n");
                    String tel2 = saisieString("Tel du Client");
                    Client client3 = clientService.rechercheParTel(tel2);

                    if (client3 == null) {
                        System.out.println("Ce Client n'existe pas");
                        break;
                    }

                    reservationView.listerReservationClient(client3);
                    break;
                default:
                    break;
            }

        } while (menu != 8);
    }

    static int saisieInt(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static String saisieString(String message) {
        System.out.print("\n" + message + ": ");
        String entier = sn.next();

        return entier;
    }

    static int menu() {

        System.out.println("\n=== Menu Principal ===");
        System.out.println("1 - Ajouter un Bien  dans un Tableau");
        System.out.println("2 - Ajouter  un Client dans un Tableau");
        System.out.println("3 - Afficher les Biens du Tableau");
        System.out.println("4 - Afficher les Clients du Tableau"); //Innacessible pour le moment
        System.out.println("5 - Ajouter une Réservation à un Bien");
        System.out.println("6 - Lister les Réservations d’un Bien");
        System.out.println("7 - Lister les Réservations d’un Client");
        System.out.println("8 - Quitter");
        System.out.println("======================");

        System.out.print("Faites un choix: ");
        return sn.nextInt();
    }
}
