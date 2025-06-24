package service;

import java.util.ArrayList;
import java.util.List;

import entity.Client;
import entity.Dette;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public Client rechercheParTel(String tel) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getTel().equals(tel)) {
                return clients.get(i);
            }
        }
        return null;
    }

    public Dette rechercheDetteParId(int id, Client client) {
        for (Dette dette : client.getDettes()) {
            if (dette.getId() == id) {
                return dette;
            }
        }
        return null;
    }
}
