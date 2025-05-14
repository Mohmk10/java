public class Transaction {
    private TypeTransaction type;
    private int id;
    private double montant;
    private String date;

    public Transaction() {
        
    }
    
    public Transaction(TypeTransaction type, int id, double montant, String date) {
        this.type = type;
        this.id = id;
        this.montant = montant;
        this.date = date;
        
    }

    public TypeTransaction getType() {
        return type;
    }
    public TypeTransaction setType(TypeTransaction type) {
        return this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
