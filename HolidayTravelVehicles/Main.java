import java.util.List;

public class Main {
	public static void main(String[] args) {
        Person person = new Person("John", "Doe", "123 Main St", "555-1234");
        System.out.println(person.toString());
        
        SalePerson salesperson = new SalePerson("Jane", "Smith", "456 Elm St", "555-5678");
        Vehicle vehicle = new Vehicle("V789", "RV Explorer", "X100", 2023, "Holiday Motors", 50000);
        DealerInstalledOption option = new DealerInstalledOption("O001", "GPS Navigation", 1500);
        DealerInstalledOption optionnone = new DealerInstalledOption("O000", "None", 0);
        
        Invoice invoice = new Invoice("I001", null, salesperson, vehicle, null, 0, List.of(option), 51500);
        Customer customer = invoice.finalizePurchase(person);
        
        System.out.println("Invoice created for: " + customer.getFirstName() + " " + customer.getLastName() + " (Customer ID: " + customer.getCustomerId() + ") by " + salesperson.getFirstName() + " " + salesperson.getLastName());
        System.out.println(vehicle.toString());
    }
}
