package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        for (Customer c : customers) {
            if (c.getName().equals(newCustomer.getName())) {
                return;
            }
        }
        customers.add(newCustomer);
    }

    public void addCustomerTransaction(String customerName, double amount) {
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                c.addTransaction(amount);
                return;
            }
        }
        System.out.println("\nCustomer not found!");
    }

    public void printCustomerStatement(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                System.out.println("\nStatement for: " + c.getName());
                System.out.println("Transactions:");

                for (Double transaction : c.getTransactions()) {
                    double amount = transaction; // Unboxing
                    System.out.println(amount);
                }
                return;
            }
        }
        System.out.println("\nCustomer not found!");
    }
}
