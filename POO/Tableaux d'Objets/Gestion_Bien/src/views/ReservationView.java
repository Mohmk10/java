package views;

import entity.Client;
import entity.Reservation;
import entity.Bien;

public class ReservationView {

    public void listerReservationClient(Client client) {
        if (client.getReservations() == null) {
            System.out.println("Ce Client n'a aucune réservation !");
        } else {
            System.out.println("\n--- Liste de réservation du Biens ---");
            for (Reservation rCl : client.getReservations()) {
                System.out.println(rCl.toString());
            }
        }
        System.out.println("---------------------\n");
    }

    public void listerReservationBien(Bien bien) {
        if (bien.getReservations() == null) {
            System.out.println("Ce Bien n'a aucune réservation !");
        } else {
            System.out.println("\n--- Liste de réservation du Bien" + bien.getReference() + " ---");
            for (Reservation rBn : bien.getReservations()) {
                System.out.println(rBn.toString());
            }
        }
        System.out.println("---------------------\n");
    }
}

