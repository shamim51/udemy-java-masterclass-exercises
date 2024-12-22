package section_10.banking_46;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName){
        for(Branch branch: branches){
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null) return false;
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch==null) return false;

        return branch.newCustomer(customerName, initialTransaction);

        //return true;

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch == null) return false;

        return branch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null) return false;

        var customers = branch.getCustomers();

        System.out.println("Customer details for branch "+branchName);

        int counter = 1;
        for(Customer customer: customers){
            System.out.println("Customer: "+customer.getName()+"["+counter+"]");

            if(printTransaction){
                int counter_2 = 1;
                var transactios = customer.getTransactions();

                System.out.println("Transactions");
                for (double transaction: transactios){
                    System.out.println("["+counter_2+"] Amount "+transaction);
                    counter_2++;
                }
            }
            counter++;

        }

        return true;
    }
}
