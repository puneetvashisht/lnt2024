public class Address {
    // fields
    int houseNumber;
    String locality;
    String city;
    int pinCode;


    // constructor
    public Address(){

    }
    public Address(int houseNumber, String locality, String city, int pinCode) {
        this.houseNumber = houseNumber;
        this.locality = locality;
        this.city = city;
        this.pinCode = pinCode;
    }

    // methods
    public void changePinCode(int newPinCode){
        this.pinCode = newPinCode;
    }

     // to string method
    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + ", pinCode="
                + pinCode + "]";
    }
    
   
    
}
