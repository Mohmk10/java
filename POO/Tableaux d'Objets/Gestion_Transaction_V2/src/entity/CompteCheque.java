package entity;

import utils.DateFormat;

public class CompteCheque extends Compte {

    private final double FRAIS = 0.08;

    public CompteCheque(String numero) {
        super(numero);
        type = TypeCompte.CHEQUE;
    }

    @Override
    public void depot(double montant) {
        double fact = montant * FRAIS;
        montant -= fact;
        this.solde += montant;
        addTransaction(new Transaction(montant, TypeTransaction.DEPOT, this));
    }

    @Override
    public boolean retrait(double montant) {
        double fact = montant * FRAIS;
        if (this.solde > fact) {
            montant -= fact;
            this.solde -= montant;
            addTransaction(new Transaction(montant, TypeTransaction.RETRAIT, this));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nType de compte: " + this.type + " \nNumero: " + this.numero + " \nSolde: " + this.solde 
        + " \nDate de création: " + DateFormat.formatDate(date) + "\nTransactions: " + this.transactions.size();
    }
    
}
