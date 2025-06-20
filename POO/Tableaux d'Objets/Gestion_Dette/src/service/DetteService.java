package service;

import java.util.ArrayList;
import java.util.List;

import entity.Client;
import entity.Dette;

public class DetteService {
    private List<Dette> dettes = new ArrayList<>();

    public List<Dette> getDettes() {
        return dettes;
    }

    public void addDette(Dette dette) {
        this.dettes.add(dette);
    }

    public void listerDette() {
        for (Dette dette : dettes) {
            System.out.println(dette.toString());
        }
    }

    public void listerDetteParClient(Client client) {
        for (Dette dette : dettes) {
            if (dette.getClient() == client) {
                System.out.println(dette.toString());
            }
        }
    }

    public void listerMontantTotalClient(Client client) {
        double total = 0;
        for (Dette dette : dettes) {
            if (dette.getClient() == client) {
                total += dette.getMontantRestant();
            }
        }
        System.out.println("\nLe montant total dû par ce client est: " + total + "\n");
    }
}
