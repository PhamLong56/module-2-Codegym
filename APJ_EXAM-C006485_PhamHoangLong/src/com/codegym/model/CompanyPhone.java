package com.codegym.model;

public class CompanyPhone extends MobilePhone {
    private int warrantyPeriod;
    private String warrantyScope;


    public CompanyPhone(String id, String name, double price, int quantity, String manufacturer, int warrantyPeriod, String warrantyScope) {
        super(id, name, price, quantity, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return "CompanyPhone{" +
                "warrantyPeriod=" + warrantyPeriod +
                ", warrantyScope='" + warrantyScope + '\'' +
                "} " + super.toString();
    }
}
