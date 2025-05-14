import java.util.List;

public class Compte {
    private int id;
    private String numero;
    private String dateCreation;
    private double montant;
    private int [] nombreTransaction;

    private Transaction [] transactions;
    
    public Compte(int id, String numero, String dateCreation, double montant, int tailleMaxTransactions) {
        this.id = id;
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.montant = montant;
        this.transactions = new Transaction[tailleMaxTransactions];
        this.nombreTransaction = null;
    }

    public Compte(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int [] getNombreTransaction() {
        return nombreTransaction;
    }

    public void setNombreTransaction(int[] nombreTransaction) {
        this.nombreTransaction = nombreTransaction;
    }
}

