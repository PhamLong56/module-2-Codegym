package model;

public class Invoice {
    private String invoiceID;
    private String orderID;
    private double amount;
    private Date date;

    public Invoice() {
    }

    public Invoice(String invoiceID, String orderID, double amount, Date date) {
        this.invoiceID = invoiceID;
        this.orderID = orderID;
        this.amount = amount;
        this.date = date;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "model.Invoice{" +
                "invoiceID='" + invoiceID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
