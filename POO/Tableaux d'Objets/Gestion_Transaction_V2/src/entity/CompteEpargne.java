package entity;

import java.time.LocalDateTime;

import utils.DateFormat;

public class CompteEpargne extends Compte{
    private LocalDateTime dateDebut;
    private long dureeBlocage;

    public CompteEpargne(String numero, long nombreMois) {
        super(numero);
        type = TypeCompte.EPARGNE;
        this.dateDebut = LocalDateTime.now();
        this.dureeBlocage = nombreMois;
    }

    // public boolean peutRetirer(LocalDateTime dateDemande) {
    //     LocalDateTime dateFinBlocage = dateDebut.plus(dureeBlocage);
    //     return !dateDemande.isBefore(dateFinBlocage);
    // }

    public boolean retraitPossible(LocalDateTime dateDemande) {

        LocalDateTime dateFinBlocage = dateDebut.plusMonths(dureeBlocage);

        if (dateDemande.isBefore(dateFinBlocage)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void depot(double montant) {
        this.solde += montant;
        addTransaction(new Transaction(montant, TypeTransaction.DEPOT, this));

    }

    @Override
    public boolean retrait(double montant) {
        LocalDateTime dateDemande = LocalDateTime.now();
        if (retraitPossible(dateDemande) && this.solde > montant) {
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
