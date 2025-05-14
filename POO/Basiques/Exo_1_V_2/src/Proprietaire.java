public class Proprietaire {

    private static int lastId = 0;

    private int id;
    private String nom; 
    private String prenom;
    private String telephone;

    public Proprietaire() {

    }

    public Proprietaire(String nom, String prenom,String telephone) {
        this.id = ++lastId;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String setNom(String newNom) {
        return this.nom = newNom;
    }

    public String setPrenom(String newPrenom) {
        return this.prenom = newPrenom;
    }

    public String setTelephone(String newTelephone) {
        return this.telephone = newTelephone;
    }

    public void copy(Proprietaire newProprietaire) {
        this.id = newProprietaire.id;
        this.nom = newProprietaire.nom;
        this.prenom = newProprietaire.prenom;
        this.telephone = newProprietaire.telephone;
    }

    public String toChaine() {
        
        return  "\nId: " + this.getId() +
                "\nNom: " + this.getNom() +
                "\nPrénom: " + this.getPrenom() +
                "\nTéléphone: " + this.getTelephone() + "\n";
    }

    public boolean egal (Proprietaire obj1, Proprietaire obj2) {

        if(obj1 == obj2){
            return true;
        } else {
            return false;
        }
    }

}
