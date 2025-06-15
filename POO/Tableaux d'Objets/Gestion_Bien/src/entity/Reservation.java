package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private LocalDate date;
    private Client client;
    private Bien bien;

    public Reservation(Client client, Bien bien) {
        this.date = LocalDate.now();
        this.client = client;
        this.bien = bien;
    }

    public Reservation() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    @Override
    public String toString() {
        DateTimeFormatter fomat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormater = date.format(fomat);
        return "\nDate: " + dateFormater + "\nClient: " + client + "\nBien: " + bien;
    }
}
