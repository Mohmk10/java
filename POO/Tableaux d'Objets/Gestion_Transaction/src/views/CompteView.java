package views;

import java.util.List;
import java.util.Scanner;

import entity.Compte;
import services.CompteService;

public class CompteView {
    private Scanner sc = new Scanner(System.in);
    private CompteService compteService;

    public CompteView(CompteService compteService) {
        this.compteService = compteService;
    }

    public Compte saisieCompte() {
        System.out.print("Entrez le Numéro: ");
        String numero = sc.nextLine();

        if (verification(numero) || numero.isBlank()) {
            return null;
        }

        return new Compte(numero);
    }

    public void afficherCompte(List<Compte> comptes) {
        if (comptes == null) {
            System.out.println("\nLe tableau de Comptes est vide !!");
        } else {
            for (int i = 0; i < comptes.size(); i++) {
                System.out.println(comptes.get(i).toString());
            }
        }
        
    }

    public boolean verification(String num) {
        if (compteService.getComptes() != null) {
            for (int i = 0; i < compteService.getComptes().size(); i++) {
                if (compteService.getComptes().get(i).getNumero().equals(num)) {
                    return true;
                }
            }
        }
        return false;
    }
}
