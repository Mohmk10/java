package view;

import java.util.List;
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
        System.out.println("\n====Saisie d'un Client====");
        String nom = saisieString("Entrez le nom");
        String adresse = saisieString("Entrez l'adresse");
        String tel = saisieString("Entrez le téléphone");

        return new Client(nom, tel, adresse);
    }

    public void afficherClient(List<Client> clients) {
        if (clients == null || clients.isEmpty()) {
            System.out.println("\nLe tableau Client est vide (ou Null) !!");
        } else {
            for (Client client : clients) {
                System.out.println(client.toString());
            }
        }
    }
}
