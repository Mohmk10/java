/*
 * Ajouter  un Bien  dans un Tableau
 * Afficher les Biens du Tableau
 * Ajouter une Réservation à un Bien
 * Lister les Réservations d’un Bien
 * Lister les Réservations d’un Client
 * Quitter
 * 
 * ** Règles de Gestion :
 * 
 * Un Bien est caractérisé par (reference,adresse, prix).Sur un bien on peut faire plusieurs réservations
 * Une Réservation est caractérisée par date:chaîne et son client qui est caractérisé par son(nom, téléphone, adresse)
 * Un client peut faire plusieurs réservations
 * Les montants sont positifs et le reference d’un bien est unique

 */



import java.util.Scanner;
public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Bien [] tabBiens = null;
        Bien bien = null;
        Client client = null;
        int choix;

        do {
            
            int menu = menu();

            if (menu == 1) {
                tabBiens = new Bien [1];
                bien = saisieBien();
                for (int i = 0; i < 1; i++) {
                    tabBiens[i] = bien;
                }
            }

            if (menu == 2) {

                if (tabBiens != null) {
                    afficheBien(tabBiens);
                } else {
                    System.out.println("\nVeuillez d'abord saisir un Bien !!!");
                }
            }

            if (menu == 3) {

                if (tabBiens != null) {

                    System.out.println("Coordonnées Client");
                    client = saisieClient();
                    System.out.println("Réservation");
                    Reservation res = ajoutRes(client);

                    for (int i = 0; i < tabBiens.length; i++) {
                        
                        bien.setRes(res);
                        System.out.println("\nRéservation ajoutée avec succès !");
                    }
                } else {
                    System.out.println("\nVeuillez d'abord saisir un Bien !!!");
                }

            }

            if (menu == 4) {

                if (bien != null) {
                    afficheReservationBien(bien);
                } else {
                    System.out.println("\nVeuillez d'abord réservé un Bien !!!");
                }
                
            }

            if (menu == 5) {

                if (client != null) {
                    afficheReservationClient(client, bien);
                } else {
                    System.out.println("\nAucun client n'a encore été crée !!!");
                }
            }

            System.out.println("\n=== Menu ===");
            System.out.println("1 - Oui");
            System.out.println("2 - Non");
            System.out.println("======================");
            choix = saisieInt("Voulez-vous continuez ?");

        } while (choix == 1);
        

        
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

    static double saisieDouble(String message) {
        System.out.print("\n" + message + ": ");
        double entier = sn.nextDouble();

        return entier;
    }

    static int menu() {

        int choix;

        do {

            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Ajouter un Bien  dans un Tableau");
            System.out.println("2 - Afficher les Biens du Tableau");
            System.out.println("3 - Ajouter une Réservation à un Bien");
            System.out.println("4 - Lister les Réservations d’un Bien");
            System.out.println("5 - Lister les Réservations d’un Client");
            System.out.println("6 - Quitter");
            System.out.println("======================");

            choix = saisieInt("Faites un choix: ");

            if (choix == 6) {
                break;
            }
            
        } while (choix == 6);

        return choix;
    }

    static Bien saisieBien() {

        String ref = saisieString("Saisissez la réference");
        String adresse = saisieString("Saisissez l'adresse");
        double prix = saisieDouble("Saisissez le prix");
        Reservation res = null;
        
        Bien bien = new Bien(ref, adresse, prix, res);

        return bien;
    }

    static void afficheBien(Bien [] tabBiens) {

        for (int i = 0; i < tabBiens.length; i++) {
            System.out.println("\n==== Bien ====");
            System.out.println("\nRéference: " + tabBiens[i].getReference());
            System.out.println("Adresse: " + tabBiens[i].getAdresse());
            System.out.println("Prix: " + tabBiens[i].getPrix());
             
        }
    }

    static Client saisieClient() {

        String nom = saisieString("Entrez le nom");
        String adresse = saisieString("Entrez l'adresse");
        String telephone = saisieString("Entrez le N°");
        Reservation res = null;

        Client client = new Client(nom, adresse, telephone, res);

        return client;
    }

    static Reservation ajoutRes(Client client) {

        int jour = saisieInt("Entrez le jour");
        int mois = saisieInt("Entrez le mois");
        int annee = saisieInt("Entrez l'année");

        Date date = new Date(jour, mois, annee);

        Reservation res = new Reservation(date, client);

        return res;

    }

    static void afficheReservationBien(Bien bien) {

        System.out.println("\n==== Bien ====");
        System.out.println("\nRéference: " + bien.getReference());
        System.out.println("Adresse: " + bien.getAdresse());
        System.out.println("Prix: " + bien.getPrix());

        System.out.println("\n==========\n");
        System.out.println(bien.getRes().getDate().dateCreation());

        System.out.println("\n== Réservé par ==");
        System.out.println("\nNom : " + bien.getRes().getClient().getNom());
        System.out.println("Adresse : " + bien.getRes().getClient().getAdresse());
        System.out.println("Télephone : " + bien.getRes().getClient().getTelephone());

    }

    static void afficheReservationClient(Client client, Bien bien) {

        System.out.println("\n== Bien(s) réservé(s) ==\n");
        client.getRes(bien);

        System.out.println("\n== Date de réservation ==\n");
        System.out.println(client.getDate());

        System.out.println("\n== Réservé par ==\n");
        System.out.println("Nom : " + client.getNom());
        System.out.println("Adresse : " + client.getAdresse());
        System.out.println("Télephone : " + client.getTelephone());

    }
}
