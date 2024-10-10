package model;

public class Customer {
    private Person customerInfo;
    private int loyaltyPoints;
    private String email;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(Person customerInfo, int loyaltyPoints, String email, String phoneNumber) {
        this.customerInfo = customerInfo;
        this.loyaltyPoints = loyaltyPoints;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Person customerInfo) {
        this.customerInfo = customerInfo;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
