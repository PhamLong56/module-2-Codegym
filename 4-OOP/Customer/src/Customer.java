public class Customer {
    public String customerName;
    public int customerID;
    public String email;
    public int phone;
    public String address;
    public Customer(String customerName, int customerID, String email, String phone, String address) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.email = email;
        this.phone = Integer.parseInt(phone);
        this.address = address;
    }

    public void register(){

    }
    public void login(){
    }

    public void updateProfile(){
    }
}
