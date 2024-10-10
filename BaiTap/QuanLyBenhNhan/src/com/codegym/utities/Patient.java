package com.codegym.utities;

import java.util.ArrayList;
import java.util.List;

/*
* 1. Quản lý Bệnh Án của Bệnh Nhân
Yêu cầu: Xây dựng một chương trình quản lý bệnh án cho bệnh viện. Mỗi bệnh nhân có mã số, tên, tuổi, giới tính, và danh sách bệnh án. Bệnh án bao gồm thông tin về chẩn đoán, ngày nhập viện, ngày ra viện, và tình trạng bệnh.
Chức năng:
Thêm/xóa/sửa thông tin bệnh nhân.
Thêm bệnh án mới cho bệnh nhân.
Tìm kiếm bệnh nhân theo tên hoặc mã số.
Xuất danh sách bệnh án của một bệnh nhân cụ thể.*/
public class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;
    private List<MedicalRecord> recordList;

    public Patient(String id, String name, int age, String gender, List<Record> medicalRecords) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.recordList = new ArrayList<>();
    }

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<MedicalRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<MedicalRecord> recordList) {
        this.recordList = recordList;
    }

    public void addRecord(MedicalRecord record) {
        this.recordList.add(record);
    }
    public void removeRecord(MedicalRecord record) {
        this.recordList.remove(record);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", medicalRecords=" + recordList +
                '}';
    }

}
