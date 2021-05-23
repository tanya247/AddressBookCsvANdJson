public class AddressBook {
    private String firstName ;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNo;
    private String email;

    public AddressBook(String firstName ,String lastName ,String address, String city,
                       String state,String phoneNo,String email,int zip) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNo = phoneNo;
        this.email = email;
        this.zip = zip;

    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' ;
    }
}
