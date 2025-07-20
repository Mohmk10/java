package services;

import java.util.ArrayList;
import java.util.List;

import entity.Transaction;

public class TransactionService {

    List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    
}
