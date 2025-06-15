package views;

import java.util.Scanner;
import entity.Client;

public class ClientView {
    private Scanner sc = new Scanner(System.in);

    public String saisieString(String message) {
        String ms = "";
        do {
            System.out.print("\n " + message + ": ");
            ms = sc.nextLine();
            if (ms.isBlank()) {
                System.out.println("\nCe champ est obligatoire");
            }
        } while (ms.isBlank());

        if (message.equals("Entrez le téléphone") || message.equals("Tel du Client")) {
            return ms.replaceAll("\\s", "");
        } else {
            return ms;
        }
    }

    public Client saisieClient() {
        System.out.println("\n====Saisie d'un Bien====");
        String nom = saisieString("Entrez le nom");
        String tel = saisieString("Entrez le téléphone");
        String adresse = saisieString("Entrez l'adresse");

        return new Client(nom, tel, adresse);
    }

}
