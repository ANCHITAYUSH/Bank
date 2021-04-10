public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        if(bank.addBranch("Delhi")) {
            System.out.println("Delhi branch created");
        }

        bank.addCustomer("Delhi", "Oberoy", 50.05);
        bank.addCustomer("Delhi", "Tata", 175.34);
        bank.addCustomer("Delhi", "Nadela", 220.12);

        bank.addBranch("Mumbai");
        bank.addCustomer("Mumbai", "Ambani", 150.54);

        bank.addCustomerTransaction("Delhi", "Oberoy", 44.22);
        bank.addCustomerTransaction("Delhi", "Oberoy", 12.44);
        bank.addCustomerTransaction("Delhi", "Tata", 1.65);

        bank.listCustomers("Delhi", true);
        bank.listCustomers("Mumbai", true);

        bank.addBranch("Kolkata");

        if(!bank.addCustomer("Kolkata", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Delhi")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Delhi", "Bose", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Delhi", "Oberoy", 12.21)) {
            System.out.println("Customer Tim already exists");
        }

    }
}

