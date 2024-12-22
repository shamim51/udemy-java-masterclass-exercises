package section_10.banking_46;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);

        /*
        → OUTPUT

        The list of customers should be printed out in the following format if boolean parameter is true:

        Customer details for branch Adelaide
        Customer: Tim[1]
        Transactions
                [1] Amount 50.05
                [2] Amount 44.22
                [3] Amount 12.44
        Customer: Mike[2]
        Transactions
                [1] Amount 175.34
                [2] Amount 1.65
        Customer: Percy[3]
        Transactions
                [1] Amount 220.12
        and if false, only the customers - no transactions:

        bank.listCustomers("Adelaide", false);
        Customer details for branch Adelaide
        Customer: Tim[1]
        Customer: Mike[2]
        Customer: Percy[3]

         */
    }
}
