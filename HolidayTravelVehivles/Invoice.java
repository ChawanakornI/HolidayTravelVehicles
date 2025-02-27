import java.util.List;

public class Invoice {
	private String invoiceNumber;
    private Customer customer;
    private SalePerson salesperson;
    private Vehicle purchasedVehicle;
    private Vehicle tradeInVehicle;
    private double tradeInAllowance;
    private List<DealerInstalledOption> options;
    private double finalPrice;

    public Invoice(String invoiceNumber, Customer customer, SalePerson salesperson, Vehicle purchasedVehicle, 
                   Vehicle tradeInVehicle, double tradeInAllowance, List<DealerInstalledOption> options, double finalPrice) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.salesperson = salesperson;
        this.purchasedVehicle = purchasedVehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.options = options;
        this.finalPrice = finalPrice;
    }

    public Customer finalizePurchase(Person person) {
        if (person instanceof Customer) {
            Customer existingCustomer = (Customer) person;
            System.out.println(existingCustomer.getFirstName() + " " + existingCustomer.getLastName() + 
                " has purchased a " + purchasedVehicle.getName());
            return existingCustomer;
        } else {
            System.out.println(person.getFirstName() + " " + person.getLastName() + 
                " is now a Holiday Travel Vehicle customer!");
            Customer newCustomer = new Customer(person.getFirstName(), person.getLastName(), 
                                                 person.getAddress(), person.getPhoneNumber());
            this.customer = newCustomer;
            System.out.println(newCustomer.getFirstName() + " " + newCustomer.getLastName() + 
                " has purchased a " + purchasedVehicle.getName());
            return newCustomer;
        }
    }
}