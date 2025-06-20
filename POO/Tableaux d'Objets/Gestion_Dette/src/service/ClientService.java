package service;

import java.util.ArrayList;
import java.util.List;

import entity.Client;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return clients;
    }

    public boolean addClient(Client client) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getTel().equals(client.getTel())) {
                return false;
            }
        }
        this.clients.add(client);
        return true;
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
