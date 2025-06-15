package service;

import entity.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client rechercheParTel(String tel) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getTel().equals(tel)) {
                return clients.get(i);
            }
        }
        return null;
    }
}
