public class AddressBook {
    private String address;
    private String emailId;
    private int mobileNumber;

    public AddressBook(String address, String emailId, int mobileNumber) {
        this.address = address;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
