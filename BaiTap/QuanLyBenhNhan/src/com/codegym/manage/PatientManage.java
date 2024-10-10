package com.codegym.manage;

import com.codegym.utities.MedicalRecord;
import com.codegym.utities.Patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PatientManage {
    private List<Patient> patients;
    private Scanner scanner;

    public PatientManage() {
        patients = new ArrayList<>();
        scanner = new Scanner(System.in);

    }


    public void addPatient() {
        System.out.println("Enter Patient ID: ");
        String patientID = scanner.nextLine();
        System.out.println("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Patient Gender: ");
        String gender = scanner.nextLine();

        Patient patient = new Patient(patientID, name, age, gender);
        patients.add(patient);
    }

    public Patient findPatientById(String id) {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) ;
            {
                return patient;
            }
        }
        return null;
    }

    public void addRecordList() {
        System.out.println("Enter Patient ID: ");
        String patientID = scanner.nextLine();

        Patient patient = findPatientById(patientID);
        if (patient != null) {
            System.out.println("Enter  diagnosis: ");
            String diagnosis = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            Date dateCheckIn = null;
            Date dateCheckOut = null;
            try{
                System.out.println("Enter Date Check In: ");
                String dateCheckInString = scanner.nextLine();
                dateCheckIn= dateFormat.parse(dateCheckInString);
                System.out.println("Enter Date Check Out: ");
                String dateCheckOutString = scanner.nextLine();
                dateCheckOut = dateFormat.parse(dateCheckOutString);
                if(dateCheckOut.before(dateCheckIn)) {
                    System.out.println("Out after In");
                    return;
                }

            }catch (ParseException e) {
                System.out.println("Invalid Date Check In, dd/MM/yyyy");
                return;
            }

            System.out.println("Enter  status patient: ");
            String status = scanner.nextLine();

            MedicalRecord record = new MedicalRecord(diagnosis, dateFormat.format(dateCheckIn), dateFormat.format(dateCheckOut), status);
            patient.addRecord(record);

            System.out.println(" Đã thêm bệnh án cho bệnh nhân "+ patient.getName());
        }else {
            System.out.println(" Không tìm thấy bệnh nhân với ID "+ patientID);

        }
    }
    public void displayRecord(){
        System.out.println("Enter Patient ID: ");
        String patientID = scanner.nextLine();

        Patient patient = findPatientById(patientID);
        if (patient != null) {
            System.out.println("Danh sach benh an cua benh nhan: "+ patient.getName());
            for(MedicalRecord record: patient.getRecordList()){
                System.out.println(record);
            }

        }else {
            System.out.println("Not found patient with ID " + patientID);
        }
    }


}
