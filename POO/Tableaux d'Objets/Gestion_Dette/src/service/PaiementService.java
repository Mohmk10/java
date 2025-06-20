package service;

import java.util.ArrayList;
import java.util.List;

import entity.Paiement;

public class PaiementService {
    private List<Paiement> paiements = new ArrayList<>();

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void addPaiement(Paiement paiement) {
        this.paiements.add(paiement);
    }

    public void listerPaiement() {
        for (Paiement paiement : paiements) {
            System.out.println(paiement.toString());
        }
    }

}
