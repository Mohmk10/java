package service;

import java.util.ArrayList;
import java.util.List;

import entity.Dette;
import entity.Paiement;
import entity.StatutDette;

public class PaiementService {
    private List<Paiement> paiements = new ArrayList<>();

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void addPaiement(Paiement paiement, Dette dette) {
        dette.setMontantPayer(dette.getMontantPayer() + paiement.getMontant());
        dette.setMontantRestant(dette.getMontantRestant() - paiement.getMontant());
        if (dette.getMontantDette() <= dette.getMontantPayer()) {
            dette.setMontantPayer(dette.getMontantDette());
            dette.setMontantRestant(dette.getMontantDette() - dette.getMontantDette());
            dette.setStatut(StatutDette.REMBOURSER);
        }

        this.paiements.add(paiement);
    }

}
