package com.codegym.model;

public class ForeignPhone extends MobilePhone {
    private String importedCountry;
    private String condition;

    public ForeignPhone(String id, String name, double price, int quantity, String manufacturer, String importedCountry, String condition) {
        super(id, name, price, quantity, manufacturer);
        this.importedCountry = importedCountry;
        this.condition = condition;
    }

    public String getImportedCountry() {
        return importedCountry;
    }

    public void setImportedCountry(String importedCountry) {
        this.importedCountry = importedCountry;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ForeignPhone{" +
                "importedCountry='" + importedCountry + '\'' +
                ", condition='" + condition + '\'' +
                "} " + super.toString();
    }
}
