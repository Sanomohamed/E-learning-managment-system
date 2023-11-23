
public class User {

    private String name;
    private String icNumber;
    private String address;

    // Constructor
    public User(String name, String icNumber, String permanentAddress) {
        this.name = name;
        this.icNumber = icNumber;
        this.address = permanentAddress;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getPermanentAddress() {
        return address;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.address = permanentAddress;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
