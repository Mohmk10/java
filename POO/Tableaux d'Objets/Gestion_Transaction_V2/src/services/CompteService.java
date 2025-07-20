package services;

import java.util.ArrayList;
import java.util.List;

import entity.Compte;

public class CompteService {

    private List<Compte> comptes = new ArrayList<>();

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
}
