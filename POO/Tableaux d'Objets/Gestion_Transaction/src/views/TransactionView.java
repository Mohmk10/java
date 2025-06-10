package views;

import java.util.List;
import java.util.Scanner;
import entity.Transaction;
import entity.Transaction.TypeTransaction;

public class TransactionView {
    private Scanner sc = new Scanner(System.in);
    TypeTransaction type;

    public void menuTr() {
        System.out.println("1 - DÉPÔT");
        System.out.println("2 - RETRAIT");
    }

    public int saisie (String message) {
        System.out.print("\n" + message + ": ");
        int a = sc.nextInt();

        return a;
    }
    
    public Transaction saisieTransaction() {

        System.out.print("Entrez le Montant: ");
        double mnt = sc.nextDouble();

        System.out.println("\n=== Type de transaction ===\n");
        int a;
        do {
            menuTr();
            a = saisie("Faites un choix");
            
        } while (a != 1 && a != 2);

        if (a == 2) {
            type = TypeTransaction.RETRAIT;
            return new Transaction(mnt, type);
        }
        type = TypeTransaction.DEPOT;
        return new Transaction(mnt, type);
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
