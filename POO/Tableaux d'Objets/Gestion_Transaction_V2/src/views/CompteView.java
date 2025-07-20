package views;

import java.util.List;
import java.util.Scanner;

import entity.Compte;
import entity.CompteCheque;
import entity.CompteEpargne;
import services.CompteService;

public class CompteView {
    private Scanner sc = new Scanner(System.in);
    private CompteService compteService;

    public CompteView(CompteService compteService) {
        this.compteService = compteService;
    }

    public Compte saisieCompte() {
        Compte compte = null;

        System.out.print("Entrez le Numéro: ");
        String numero = sc.nextLine();

        System.out.println("1 - Ajout de compte de Chèque");
        System.out.println("2 - Ajout de compte d'Épargne");
        int type = saisie("Choisissez");

        if (verification(numero) || numero.isBlank()) {
            return null;
        } else if (type == 1) {
            compte = new CompteCheque(numero);
        } else if (type == 2) {
            System.out.println("Entrez la durée de blocage (en mois): ");
            long dureeBlocage = sc.nextLong();
            compte = new CompteEpargne(numero, dureeBlocage);
        }

        return compte;        
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

    public void afficherCompte(List<Compte> comptes) {
        if (comptes == null) {
            System.out.println("\nLe tableau de Comptes est vide !!");
        } else {
            for (int i = 0; i < comptes.size(); i++) {
                System.out.println(comptes.get(i).toString());
            }
        }
    }

    public int saisie (String message) {
        System.out.print("\n" + message + ": ");
        int a = sc.nextInt();
        return a;
    }
}
