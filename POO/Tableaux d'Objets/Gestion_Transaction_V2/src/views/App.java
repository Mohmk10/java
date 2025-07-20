package views;

import java.util.Scanner;

import entity.Compte;
import services.CompteService;
import services.TransactionService;

public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CompteService compteService = new CompteService();
        CompteView compteView = new CompteView(compteService);
        TransactionService transactionService = new TransactionService();
        TransactionView transactionView = new TransactionView();

        int choix;
    
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    Compte compte = compteView.saisieCompte();
                    if(compte != null) {
                        compteService.addCompte(compte);
                        System.out.println("\nCompte enrégistré avec succès");
                    } else {
                        System.out.println("\nLes numéros sont Unique et Obligatoire\nLe compte n'as pas été enrégistré");
                    }
                break;
                case 2:
                    compteView.afficherCompte(compteService.getComptes());
                    break;
                case 3:
                    int id = saisie("Donnez l'ID du compte");
                    var compteId = compteService.rechercheCompteParId(id);
                    if(compteId != null) {
                        var tr = transactionView.saisieTransaction(compteId);
                        if (tr != null) {
                            transactionService.addTransaction(tr);
                            System.out.println("Transaction effectuée avec succès");
                        } else {
                            System.out.println("Désolé, la transaction a échouée !");
                        }
                    } else {
                        System.out.println("Aucun ID ne correspond à ce compte");
                    }
                    break;
                case 4:
                    System.out.println("\n=== Toutes les transactions effectuées ===");
                    transactionView.afficherTransaction(transactionService.getTransactions());
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

    public static int saisie (String message) {
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
        System.out.println("1 - Ajouter un compte");
        System.out.println("2 - Afficher le(s) compte(s)");
        System.out.println("3 - Ajouter une transaction à un compte");
        System.out.println("4 - Lister les transactions d'un compte");
        System.out.println("5 - Quitter");
        System.out.println("======================\n");

        System.out.print("Faites un choix: ");
        return sc.nextInt();
    }
}
