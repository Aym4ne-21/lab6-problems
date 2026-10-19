package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        Customer c1 = new Customer("Ali");
        Customer c2 = new Customer("Sara");

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        bank.addCustomer(new Customer("Ali"));

        bank.addCustomerTransaction("Ali", 500.0);
        bank.addCustomerTransaction("Ali", -100.0);
        bank.addCustomerTransaction("Sara", 200.0);

        // Try adding a transaction for a nonexistent customer
        bank.addCustomerTransaction("Omar", 50.0);

        bank.printCustomerStatement("Ali");

        bank.printCustomerStatement("Sara");

        // Try printing a nonexistent customer's statement
        bank.printCustomerStatement("Omar");

        // Test a customer with no transactions
        Customer c3 = new Customer("Youssef");
        bank.addCustomer(c3);
        ;
        bank.printCustomerStatement("Youssef");

        Bank emptyBank = new Bank("Empty Bank");

        System.out.println("\n--- Empty Bank Test ---");
        emptyBank.printCustomerStatement("Ali");
    }
}
