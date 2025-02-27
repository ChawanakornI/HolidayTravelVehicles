
class Customer extends Person {
    private static int customerId = 0;

    public Customer(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
        this.customerId = ++customerId;
    }

    public int getCustomerId() {
        return customerId;
    }
}
