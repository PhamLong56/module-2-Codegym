package com.codegym.utities;

public class MedicalRecord {
    private String diagnosis;
    private String checkInDate;
    private String checkOutDate;
    private String status;

    public MedicalRecord(String diagnosis, String checkInDate, String checkOutDate, String status) {
        this.diagnosis = diagnosis;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "diagnosis='" + diagnosis + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
