package services;

import java.util.ArrayList;
import java.util.List;

import entity.Compte;
import entity.Transaction;
import entity.Transaction.TypeTransaction;

public class CompteService {
    private List<Compte> comptes = new ArrayList<>();

    public List<Compte> afficherComptes() {
        return comptes;
    }
    public void addCompte(Compte compte) {
        comptes.add(compte);
    }
    public List<Compte> getComptes() {
        return comptes;
    }

    public Compte rechercheCompteParId(int id) {
        for (int i = 0; i < comptes.size(); i++) {
            if (comptes.get(i).getId() == id) {
                return comptes.get(i);
            }
        }
        return null;
    }
    
    public boolean addTransaction(Compte compte, Transaction transaction) {
        if (transaction.getType() == TypeTransaction.RETRAIT) {
            if (compte.getMontant() < transaction.getMontant()) {
                return false;
            }
                transaction.setMontant(transaction.getMontant());
                compte.setMontant(compte.getMontant() - transaction.getMontant());
        } else {
            transaction.setMontant(transaction.getMontant());
            compte.setMontant(compte.getMontant() + transaction.getMontant());
        }
    
        compte.setTransactions(transaction);
        return true;
    }

    public List<Transaction> getAllTransactions() {
        List<Transaction> allTransactions = new ArrayList<>();
        for (Compte compte : comptes) {
            if (compte != null) {
                allTransactions.addAll(compte.getTransactions());
            }
        }
        return allTransactions;
    }
}
