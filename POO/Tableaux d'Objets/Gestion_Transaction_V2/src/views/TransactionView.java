package views;

import java.util.List;
import java.util.Scanner;

import entity.Compte;
import entity.Transaction;
import entity.TypeCompte;
import entity.TypeTransaction;

public class TransactionView {
    
    private Scanner sc = new Scanner(System.in);
    private TypeTransaction type;

    public void menuTr() {
        System.out.println("1 - DÉPÔT");
        System.out.println("2 - RETRAIT");
    }

    public int saisie (String message) {
        System.out.print("\n" + message + ": ");
        int a = sc.nextInt();

        return a;
    }
    
    public Transaction saisieTransaction(Compte compte) {

        System.out.print("Entrez le Montant: ");
        double montant = sc.nextDouble();

        System.out.println("\n=== Type de transaction ===\n");
        int a;
        do {
            menuTr();
            a = saisie("Faites un choix");
            
        } while (a != 1 && a != 2);

        if (a == 1 && compte.getType() == TypeCompte.CHEQUE) {
            compte.depot(montant);
            type = TypeTransaction.DEPOT;

            return new Transaction(montant, type, compte);

        } else if (a == 1 && compte.getType() == TypeCompte.EPARGNE) {
            compte.depot(montant);
            type = TypeTransaction.DEPOT;

            return new Transaction(montant, type, compte);

        } else if (a == 2 && compte.getType() == TypeCompte.CHEQUE) {
            if (compte.retrait(montant)) {
                type = TypeTransaction.RETRAIT;
                return new Transaction(montant, type, compte);
            } else {
                return null;
            }
        } else if (a == 2 && compte.getType() == TypeCompte.EPARGNE) {
            if (compte.retrait(montant)) {
                type = TypeTransaction.RETRAIT;
                return new Transaction(montant, type, compte);
            } else {
                return null;
            }
        }

        return null;
    }

    public void afficherTransaction(List<Transaction> transactions) {
        if (transactions == null) {
            System.out.println("\nLe tableau de Comptes est vide !!");
        } else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i).toString());
            }
        }
        
    }
}
