package service;

import java.util.ArrayList;
import java.util.List;

import entity.*;

public class ReservationService {
    List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Client client, Bien bien) {
        Reservation r = new Reservation(client, bien);
        client.addReservations(r);
        bien.addReservations(r);
    }
}
