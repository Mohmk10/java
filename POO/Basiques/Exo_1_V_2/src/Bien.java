public class Bien {

    private int id;
    private String reference;
    private double prix;
    private String description;
    private double superficie;
    private String adresse;
    private Proprietaire prop;

    public Bien(Proprietaire prop) {
        this.prop = prop;
    }

    public Bien(int id, String reference, String adresse, Proprietaire prop) {
        this.id = id;
        this.reference = reference;
        this.adresse = adresse;
        this.prop = prop;
        this.prix = 0.0;
        this.description = "";
        this.superficie = 0.0;
    }

    public Bien(int id, String reference, double prix, String description, double superficie, String adresse, Proprietaire prop) {
        this.id = id;
        this.reference = reference;
        this.prix = prix;
        this.description = description;
        this.superficie = superficie;
        this.adresse = adresse;
    }

    public int getId() {
        return this.id;
    }

    public String getReference() {
        return this.reference;
    }

    public double getPrix() {
        return this.prix;
    }

    public String getDescription() {
        return this.description;
    }

    public double getSuperficie() {
        return this.superficie;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public Proprietaire getProprietaire() {
        return this.prop;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setReference(String newReference) {
        this.reference = newReference;
    }

    public void setPrix(double newPrix) {
        this.prix = newPrix;
    }

    public void setDecription(String newDescription) {
        this.description = newDescription;
    }

    public void setSuperficie(double newSuperficie) {
        this.superficie = newSuperficie;
    }

    public void setAdresse(String newAdress) {
        this.adresse = newAdress;
    }

    public void setProprietaire(Proprietaire newProp) {
        this.prop = newProp;
    }

    public void copy(Bien newBien) {
        this.id = newBien.id;
        this.reference = newBien.reference;
        this.prix = newBien.prix;
        this.description = newBien.description;
        this.superficie = newBien.superficie;
        this.adresse = newBien.adresse;
    }

    public String toChaine() {
        
        return  "\nId: " + this.getId() +
                "\nReference: " + this.getReference() +
                "\nPrix: " + this.getPrix() +
                "\nDescription: " + this.getDescription() +
                "\nSuperficie: " + this.getSuperficie() +
                "\nAdresse: " + this.getAdresse() + "\n";
    }

    public double convert(double superficie){

        double convert = superficie * 0.1;
        return convert;
    }

    public boolean egal (BienV1 obj1, BienV1 obj2) {

        if(obj1 == obj2){
            return true;
        } else {
            return false;
        }
    }

}
