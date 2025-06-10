package views;

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
 * 
 * *** Nouvelles contraintes
 * 
 * 1. Utiliser les collections List au lieu des tableaux staiques
 * 2. Utilise les classe LocalDate et LocalDateTime de Java
 * 3. Lster toutes les transactions et donner le choix à l'utilisateur de le filtrer
 * 4. Les numeros sont uniques et obligatoires

 */

import java.util.Scanner;

import services.CompteService;
import entity.Compte;
import entity.Transaction;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static final int N = 10;
    static Compte [] comptes = new Compte[N];
        public static void main(String[] args) throws Exception {
            Compte compte = new Compte();
            CompteService compteService = new CompteService();
            CompteView compteView = new CompteView(compteService);
            Transaction tr = new Transaction();
            TransactionView transactionView = new TransactionView();
            int choix;
    
            do {
                choix = menu();
                switch (choix) {
                    case 1:
                        compte = compteView.saisieCompte();
                        if(compte != null) {
                            compteService.addCompte(compte);
                            System.out.println("Compte enrégistré avec succès");
                        } else {
                            System.out.println("Les numéros sont Unique et Obligatoire\nLe compte n'as pas été enrégistré");
                        }
                    break;
                    case 2:
                        compteView.afficherCompte(compteService.getComptes());
                    break;
                    case 3:
                        int id = saisie("Donnez l'ID du compte");
                        compte = compteService.rechercheCompteParId(id);
                        if(compte != null) {
                            tr = transactionView.saisieTransaction();
                            if (compteService.addTransaction(compte, tr)) {
                                System.out.println("Transaction effectuée avec succès");
                            } else {
                                System.out.println("Echec, solde insuffisant");
                            }
                        } else {
                            System.out.println("Aucun ID ne correspond à ce compte");
                        }
                        break;
                    case 4:
                        System.out.println("\n=== Toutes les transactions effectuées ===");
                        transactionView.afficherTransaction(compteService.getAllTransactions());
                        int a;
                        do {
                            a = menuTr();
                            if (a == 1) {
                                id = saisie("Donnez l'ID du compte");
                                compte = compteService.rechercheCompteParId(id);
                                if(compte != null) {
                                    transactionView.afficherTransaction(compte.getTransactions());
                                } else {
                                    System.out.println("Aucun ID ne correspond à ce compte");
                                }
                            }
                        } while (a != 2);
                        break;
                    default:
                        break;
                }
            } while (choix != 5);
    
        }
    
    static int saisie (String message) {
        System.out.print("\n" + message + ": ");
        int a = sc.nextInt();
        return a;
    }

    public static int menuTr(){
        System.out.println("\n=== Menu Transaction ===");
        System.out.println("1 - Filtrer par compte");
        System.out.println("2 - Quitter");

        System.out.print("Faites un choix: ");
        return sc.nextInt();
    }

    public static int menu() {
        System.out.println("\n=== Menu Principal ===");
        System.out.println("1 - Ajout de compte");
        System.out.println("2 - Afficher le(s) compte(s)");
        System.out.println("3 - Ajouter une transaction à un compte");
        System.out.println("4 - Lister les transactions d'un compte");
        System.out.println("5 - Quitter");
        System.out.println("======================\n");

        System.out.print("Faites un choix: ");
        return sc.nextInt();
    }
}
