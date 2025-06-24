package service;

import java.util.ArrayList;
import java.util.List;


import entity.Dette;

public class DetteService {
    private List<Dette> dettes = new ArrayList<>();

    public List<Dette> getDettes() {
        return dettes;
    }

    public void addDette(Dette dette) {
        this.dettes.add(dette);
    }

    public List<Dette> listerDette() {
        return dettes;
    }

    public Dette rechercheDetteParId(int id) {
        for (Dette dette : dettes) {
            if (dette.getId() == id) {
                return dette;
            }
        }

        return null;
    }
}
