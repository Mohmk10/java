public class Client {

    private String nom;
    private String adresse;
    private String telephone;
    private  Reservation res;

    public Client(String nom, String adresse, String telephone, Reservation res) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.res = res;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void getRes(Bien bien) {
        bien.getBien(bien);
    }

    public String getDate() {
        return res.getRes();
    }

    public void setRes(Reservation res) {
        this.res = res;
    }

}
