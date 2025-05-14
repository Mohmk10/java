
/*
 * Soit la classe Compte qui contient les attributs suivants : 
 *  id:entier
 *  numéro:chaine
 *  dateCreation:chaîne
 *  montant:réel
 *  et ses transactions avec les attributs suivants :id,type[Dépôt|Retrait], montant,date
 * 
 * Réaliser le Menu suivant : 
 * Définir les classes avec les méthodes :
 * Constructeurs avec arguments et sans arguments
 * Les Getters et Setters
 * 
 * Dans la classe App.java, réaliser les fonctions suivantes :
 * Ajouter un compte dans le tableau
 * Afficher les comptes du tableau
 * Ajouter une Transaction à un compte
 * Lister les transactions d’un compte

 */

import java.util.Scanner;

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Compte [] tabComptes = null;
        Transaction [] tabTr = null;
        int choix;

        do {
            int menu = menu();

            if (menu == 1) {
                /* Ajout compte dans le tableau */
                int taille = saisie("Combien de compte voulez-vois saisir ?");
                tabComptes = new Compte[taille];
                tabComptes = ajoutCompte(tabComptes);
            }
            
            if (menu == 2) {
                if (tabComptes != null) {
                    afficheCompte(tabComptes);
                } else {
                    System.out.println("\nLe tableau n'a pas encore été rempli");
                }
            }

            if (menu == 3) {
                int id = saisie("Entrez l'ID du compte");
                if (tabComptes != null) {
                    for (int i = 0; i < tabComptes.length; i++) {
                        if (tabComptes[i].getId() == (Integer) id) {
                            int [] nombreTransaction = new int[1];
                            tabTr = new Transaction[1];
                            tabTr = ajoutTransaction(tabTr);
                            nombreTransaction[0] = 1;
                            tabComptes[i].setNombreTransaction(nombreTransaction);
                        }
                    }
                } else {
                    System.out.println("\nLe tableau n'a pas encore été rempli");
                }
            }

            if (menu == 4) {
                int id = saisie("Entrez l'ID du compte");
                if (tabComptes != null) {
                    for (int i = 0; i < tabComptes.length; i++) {
                        if (tabComptes[i].getId() == (Integer) id) {
                            if (tabTr != null) {
                                afficheTransaction(tabTr);
                            } else {
                                System.out.println("\nAucune transaction effectuée");
                            }
                        }
                    }
                } else {
                    System.out.println("\nLe tableau n'a pas encore été rempli");
                }
            }

            System.out.println("\n=== Menu ===");
            System.out.println("1 - Oui");
            System.out.println("2 - Non");
            System.out.println("======================");
            choix = saisie("Voulez-vous continuez ?");

        } while (choix == 1);
        

        
    }

    static int menuTransaction() {

        int choix;

        do {

            System.out.println("\n=== Menu ===");
            System.out.println("1 - DÉPÔT");
            System.out.println("2 - RETRAIT");
            System.out.println("======================\n");

            choix = saisie("Faites un choix: ");

            if (choix == 1 || choix == 2) {
                break;
            }
            
        } while (choix != 1 || choix != 2);

        return choix;
    }

    static int menu() {

        int choix;

        do {

            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Ajout de compte");
            System.out.println("2 - Afficher le(s) compte(s)");
            System.out.println("3 - Ajouter une transaction à un compte");
            System.out.println("4 - Lister les transactions d'un compte");
            System.out.println("5 - Quitter");
            System.out.println("======================");

            choix = saisie("Faites un choix: ");

            if (choix == 5) {
                break;
            }
            
        } while (choix == 5);

        return choix;
    }

    static int saisie (String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static Compte saisieCompte() {
        int id = saisie("Entrez l'id");
        System.out.print("Entrez le numéro: ");
        String num = sn.next();
        System.out.print("Entrez le montant: ");
        double montant = sn.nextDouble();

        DateCompte date = new DateCompte();
        System.out.println("\n==== Saisie de la date de création====\n");

        boolean verifieDate;

        int jour;
        int mois;
        int annee;

        do {
            jour = saisie("Entrez le jour");
            mois = saisie("Entrez le mois");
            annee = saisie("Entrez l'année");
            verifieDate = date.validationDate(jour, mois, annee);

            if (!verifieDate) {
                System.out.println("\nCette date n'est pas valide !");
            }
            
        } while (!verifieDate);

        Compte compte = new Compte(id, num, date.dateCreation(jour, mois, annee), montant, 1);

        return compte;
    }

    static Compte [] ajoutCompte(Compte [] tabComptes) {

        for (int i = 0; i < tabComptes.length; i++) {
            tabComptes[i] = saisieCompte();
        }

        return tabComptes;
    }

    static void afficheCompte(Compte [] tabCompte) {
        int a = 1;
        for (int i = 0; i < tabCompte.length; i++) {
            System.out.println("\n==== Compte " + a + " ====");
            System.out.println("\nId: " + tabCompte[i].getId());
            System.out.println("N°:" + tabCompte[i].getNumero());
            System.out.println("Montant: " + tabCompte[i].getMontant());
            System.out.println("Date de création: " + tabCompte[i].getDateCreation());
            if (tabCompte[i].getNombreTransaction() == null || tabCompte[i].getNombreTransaction() == new int[0]) {
            System.out.println("Nombre de transaction: Aucune transaction effectuée\n");
            } else {
                System.out.println("Nombre de transaction: " + tabCompte[i].getNombreTransaction()[0] + "\n");
            }
            a++;
        }
    }

    static Transaction saisieTransaction() {

        Transaction tr = new Transaction();

        int id = saisie("Entrez l'id");
        System.out.print("Entrez le montant: ");
        double montant = sn.nextDouble();

        DateCompte date = new DateCompte();
        System.out.println("\n==== Saisie de la date de création====\n");

        boolean verifieDate;

        int jour;
        int mois;
        int annee;

        do {

            jour = saisie("Entrez le jour");
            mois = saisie("Entrez le mois");
            annee = saisie("Entrez l'année");
            verifieDate = date.validationDate(jour, mois, annee);

            if (!verifieDate) {
                System.out.println("\nCette date n'est pas valide !");
            }
            
        } while (!verifieDate);

        int menuTr = menuTransaction();
        if (menuTr == 1) {
            TypeTransaction type =  tr.setType(TypeTransaction.DEPOT);
            return tr = new Transaction(type, id, montant, date.dateCreation(jour, mois, annee));

        } 
        else {
            TypeTransaction type = tr.setType(TypeTransaction.RETRAIT);
            return tr = new Transaction(type, id, montant, date.dateCreation(jour, mois, annee));
        }

    }

    static Transaction [] ajoutTransaction(Transaction [] tabTr) {

        for (int i = 0; i < tabTr.length; i++) {
            tabTr[i] = saisieTransaction();
        }

        return tabTr;
    }

    static void afficheTransaction(Transaction [] tabTr) {
        for (int i = 0; i < tabTr.length; i++) {
            int a = 1;
            System.out.println("\n==== Compte " + a + " ====\n");
            System.out.println("Type de transaction: " + tabTr[i].getType() + "\n");
            System.out.println("Id: " + tabTr[i].getId());
            System.out.println("Montant: " + tabTr[i].getMontant());
            System.out.println(tabTr[i].getDate());
            a++;
        }
    }
}
