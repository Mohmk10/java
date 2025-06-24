package view;
/*
 * Ajouter  un client  dans un Tableau
 * Afficher les Clients du Tableau
 * Ajouter une Dette à un client
 * Lister dettes d’un client 
 * Lister Montant total dû Par client
 * Ajouter un Paiement à une Dette
 * Lister les Payements d’une Dette d’un client
 * 
 *      Règles de Gestion :
 * Un client est caractérisé par son(nom,téléphone, adresse) et un client peut avoir plusieurs dettes
 * Une Dette caractérisé par date:chaine,montantDette,montantPaye,montantRestant et liste de paiements
 * montantRestant=montantDette-montantPaye
 * montantPaye=somme des paiements effectués sur la dette
 * Un paiement est caractérisé par   date:chaine et montant
 * Les montants sont positifs et le téléphone d’un client est unique 
 * A l’ajout d’un client on peut lui ajouter une  ou des dettes

 */


import java.util.Scanner;

import entity.Client;
import entity.Dette;
import entity.StatutDette;
import service.ClientService;
import service.DetteService;
import service.PaiementService;

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ClientService clientService = new ClientService();
        ClientView clientView = new ClientView();
        DetteService detteService = new DetteService();
        DetteView detteView = new DetteView();
        PaiementService paiementService = new PaiementService();
        PaiementView paiementView = new PaiementView();

        int menu;

        do {
            menu = menu();
            switch (menu) {
                case 1:
                    Client client = clientView.saisieClient();
                    var clientVerify = clientService.rechercheParTel(client.getTel());
                    if (clientVerify == null) {
                        clientService.addClient(client);
                        System.out.println("\nClient ajouté avec succès\n");
                    } else {
                            System.out.println("\nCe client existe déjà\n");
                        }
                    break;
                case 2:
                    System.out.println("\n====Liste des clients====");
                    clientView.afficherClient(clientService.getClients());
                    break;
                case 3:
                    String tel1 = saisieString("Entrez le N° de tel du client");
                    Client client1 = clientService.rechercheParTel(tel1);
                    if (client1 == null) {
                        System.out.println("\nAucun client ne possède ce N° de tel");
                    } else {
                        Dette dette = detteView.saisieDette(client1);
                        detteService.addDette(dette);
                        client1.addDette(dette);
                        System.out.println("\nDette ajoutée avec succès\n");
                    }
                    break;
                case 4:
                    var dettes = detteService.listerDette();
                    detteView.afficherDette(dettes);
                    int choix;
                    do {
                        System.out.println("\nVoulez-vous filtrer par Client ?\n");
                        choix = miniMenu();
                        
                        if (choix == 1) {
                            String tel2 = saisieString("Entrez le N° de tel du client");
                            Client client2 = clientService.rechercheParTel(tel2);
                            if (client2 == null) {
                                System.out.println("\nAucun client ne possède ce N° de tel");
                            } else {
                                detteView.afficherDette(client2.getDettes());
                            }
                        }
                    } while (choix != 2);
                    
                    break;
                case 5:
                    String tel3 = saisieString("Entrez le N° de tel du client");
                    Client client3 = clientService.rechercheParTel(tel3);
                    if (client3 == null) {
                        System.out.println("\nAucun client ne possède ce N° de tel");
                    } else {
                        System.out.println("\n Le montant total des dettes du client: " + client3.listerMontantTotalClient());
                    }
                    break;
                case 6:
                    String tel4 = saisieString("Entrez le N° de tel du client");
                    Client client4 = clientService.rechercheParTel(tel4);
                    if (client4 == null) {
                        System.out.println("\nAucun client ne possède ce N° de tel");
                    } else {
                        if (client4.getDettes() == null || client4.getDettes().isEmpty()) {
                            System.out.println("\nCe lient n'a aucune dette !");
                        } else {
                            System.out.println("\n====Liste des dettes du client " + client4.getNom() + " ====");
                            detteView.afficherDette(client4.getDettes());

                            System.out.println("\nEntrez l'ID de la dette à laquelle vous voulez assigner un paiement");
                            int id = saisieInt("Entrez l'ID");

                            var dette = detteService.rechercheDetteParId(id);
                            if (dette != null) {
                                if (dette.getStatut() == StatutDette.REMBOURSER) {
                                    System.out.println("\nCette dette est remboursée.");
                                } else {
                                    System.out.println(dette.toString());
                                    var paiement = paiementView.saisiePaiement();
                                    if (dette.getMontantRestant() > paiement.getMontant()) {
                                        dette.addPaiement(paiement);
                                        paiementService.addPaiement(paiement, dette);
                                    } else {
                                        dette.addPaiement(paiement);
                                        paiementService.addPaiement(paiement, dette);
                                        System.out.println("La dette a été totalement payée");
                                    }
                                }
                            } else {
                                System.out.println("\nAucune dette ne correspond à l'ID " + id + " pour ce client.");
                            }
                        }
                    }
                    break;
                case 7:
                    String tel5 = saisieString("Entrez le N° de tel du client");
                    Client client5 = clientService.rechercheParTel(tel5);
                    if (client5 == null) {
                        System.out.println("\nAucun client ne possède ce N° de tel");
                    } else {
                        if (client5.getDettes() == null || client5.getDettes().isEmpty()) {
                            System.out.println("\nCe lient n'a aucune dette !");
                        } else {
                            System.out.println("\nEntrez l'ID de la dette à laquelle vous voulez lister les paiements");
                            int id = saisieInt("Entrez l'ID");

                            var dette = clientService.rechercheDetteParId(id, client5);

                            if (dette == null) {
                                System.out.println("\nAucune dette de ce client n'a cet ID");
                            } else {
                                if (dette.getPaiements().isEmpty()) {
                                    System.out.println("\nCette dette n'a aucun paiement");
                                } else {
                                    paiementView.affciherPaiementDetteClient(dette.getPaiements());
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
            
        } while (menu != 8);
    }

    static String saisieString(String message) {
        System.out.print("\n" + message + ": ");
        String entier = sn.next();

        return entier;
    }

    static int saisieInt(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static double saisieDouble(String message) {
        System.out.print("\n" + message + ": ");
        double entier;
        do {
            entier = sn.nextDouble();
            if (entier < 0) {
                System.out.println("\nVeuillez entrer un prix positif");
            }
        } while (entier < 0);

        return entier;
    }

    static int miniMenu() {
        System.out.println("1 - Oui");
        System.out.println("2 - Non");

        System.out.print("Faites un choix: ");
        return sn.nextInt();
    }

    static int menu() {

        System.out.println("\n=== Menu Principal ===");
        System.out.println("1 - Ajouter  un client  dans un Tableau");
        System.out.println("2 - Afficher les Clients du Tableau");
        System.out.println("3 - Ajouter une Dette à un client");
        System.out.println("4 - Lister dettes d’un client");// Modifier en : Lister toutes les dettes et filtrer par client
        System.out.println("5 - Lister Montant total dû Par client");
        System.out.println("6 - Ajouter un Paiement à une Dette");
        System.out.println("7 - Lister les Payements d’une Dette d’un client");
        System.out.println("8 - Quitter");
        System.out.println("======================");

        System.out.print("Faites un choix: ");
        return sn.nextInt();
    }
}
