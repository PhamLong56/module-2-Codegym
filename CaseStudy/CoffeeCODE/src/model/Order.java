package model;

public class Order {
    private int orderID;
    private Date date;
    private int customerID;
    private boolean status;

    public Order() {
    }

    public Order(int orderID, Date date, int customerID, boolean status) {
        this.orderID = orderID;
        this.date = date;
        this.customerID = customerID;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
