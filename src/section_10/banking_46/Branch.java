package section_10.banking_46;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String name, double initialTransaction){
        if(findCustomer(name) != null){
            return false;
        }
        customers.add(new Customer(name, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer == null) return false;

        customer.addTransaction(transaction);

        return true;
    }



    private Customer findCustomer(String customerName){
        for (Customer customer: customers){
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }


    public String getName() {

        return name;
    }

    public ArrayList<Customer> getCustomers() {

        return customers;
    }
}
