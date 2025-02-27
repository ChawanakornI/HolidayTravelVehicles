
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	
	public Person(String firstName, String lastName,String address,String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
    public String toString() {
        return "Name: " + firstName +" "+ lastName +"\n" +"Address: " + address +"\n"+ "Phone: " + phoneNumber;
    }
}
