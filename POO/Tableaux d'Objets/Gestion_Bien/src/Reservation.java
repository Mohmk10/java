public class Reservation {

    private Date date;
    private Client client;
    private Bien bien;

    public Reservation(Date date, Client client) {
        this.date = date;
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRes() {
        return date.dateCreation();
    }

}
