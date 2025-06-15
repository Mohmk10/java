package service;

import java.util.ArrayList;
import java.util.List;

import entity.Bien;

public class BienService {
    List<Bien> biens = new ArrayList<>();

    public List<Bien> getBiens() {
        return biens;
    }

    public void addBien(Bien bien) {
        biens.add(bien);
    }

    public Bien rechercheParRef(String ref) {
        for (int i = 0; i < biens.size(); i++) {
            if (biens.get(i).getReference().equals(ref)) {
                return biens.get(i);
            }
        }
        return null;
    }
}
