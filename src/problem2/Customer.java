package problem2;

import java.util.ArrayList;

public class Customer {
    private String name ;
    private ArrayList<Double> transactions ;


    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }
    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }
}
