import java.util.ArrayList;


public class Branches {
    private String name;
    private ArrayList<Costumers> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<Costumers>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Costumers> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Costumers(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Costumers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Costumers findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Costumers checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
